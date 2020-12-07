package algo3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		int N = 0;
		  do
		  {
		  
		  System.out.print("Enter N between between 1 and 20000: ");
		  N = input.nextInt();
	      System.out.println("You entered " + N);
	     

		  }while (N > 20000 || N < 0);
		  int[] A = new int[N];
			 
		  for(int i=0; i<N ; i++) {
			  
			  
			  
			  A[i] = 0;
			 
			  do {
			  System.out.print("Enter un valeur entre -100 et 100 dans la case " +(i+1));
			  
			  A[i] = input.nextInt();
		      System.out.println("You entered " + A[i]);
			  

			 }while (A[i] > 100 || A[i] < -100);
			  
			  
			  
		  }
		input.close();
		int s = solution(A);
		System.out.println(s);
		  
		

	}
	public static int solution(int[] A) {

        int N = A.length;

        int sum = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {

            A[i] = Math.abs(A[i]);
            sum += A[i];

            max = Math.max(A[i], max);
        }


        int[] counts = new int[max + 1];

        for (int i = 0; i < N; i++) {
            counts[A[i]] += 1;
        }

        int[] Total = new int[sum + 1];

        Arrays.fill(Total, -1);
        Total[0] = 0;
        for (int i = 1; i <= max; i++) {

            if (counts[i] > 0) {

                for (int j = 0; j <= sum; j++) {
                    if (Total[j] >= 0) {
                        Total[j] = counts[i];
                    }
                    else if ((j - i) >= 0 && Total[j - i] > 0) {
                        Total[j] = Total[j - i] - 1;
                    }
                }
            }
        }

        int result = sum;
        for (int i = 0; i < sum / 2 + 1; i++) {
            if (Total[i] >= 0) {
                result = Math.min(result, sum - 2 * i);
            }
        }

        return result;
    }

}
