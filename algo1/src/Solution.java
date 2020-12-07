import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		
		int N = 0;
		int M = 0;
		  do
		  {
		  
		  System.out.print("Enter N between between 1 and 100000: ");
		  N = input.nextInt();
	      System.out.println("You entered " + N);
	     

		  }while (N > 100000 || N < 1);
		  do
		  {
		  
		  System.out.print("Enter M between between 1 and 100000: ");
		  M = input.nextInt();
	      System.out.println("You entered " + M);
	     

		  }while (M > 100000 || M < 1);
		  
		  int[] A = new int[M];
		 
		  for(int i=0; i<M ; i++) {
			  
			  
			  
			  A[i] = 0;
			 
			  do {
			  System.out.print("Enter le valeur de la case " +(i+1));
			  
			  A[i] = input.nextInt();
		      System.out.println("You entered " + A[i]);
			  

			 }while (A[i] > N+1 || A[i] < 1);
			  
			  
			  
		  }
		input.close();
		int[] l = solution(N,A);
		List<Integer> intList = new ArrayList<Integer>(l.length);
		for (int i : l)
		{
		    intList.add(i);
		}
		
		System.out.println(intList);
	
	

	}
	public static int[] solution(int X, int[] D) {
		int[] S = new int[X];
		for(int i=0; i<D.length;i++) {
			if(D[i]>=1 && D[i]<=X) {
				S[D[i]-1]+=1;
			}
			else if(D[i]==X+1) {
				int max=0;
				for(int j=0; j<X; j++) {
					if(S[j]>max) {
						max=S[j];
					}
				}
				for(int p=0; p<X; p++) {
					S[p]=max;
					
				}
			}
		}
		
		return S;
	}

}
