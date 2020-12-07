package algo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		
		int L=0;
		  do
		  {
		  
		  System.out.print("Enter L between between 1 and 50000: ");
		  L = input.nextInt();
	      System.out.println("You entered " + L);
	     

		  }while (L > 50000 || L < 1);
		  int[] A = new int[L];
		  int[] B = new int[L];
		 
		  for(int i=0; i<L ; i++) {
			  
			  
			  
			  A[i] = 0;
			 
			  do {
			  System.out.print("Enter le valeurde tableau A(entre 1 et L) de la case  " +(i+1));
			  
			  A[i] = input.nextInt();
		      System.out.println("You entered " + A[i]);
			  

			 }while (A[i] > L || A[i] < 1);
			  
			  
			  
		  }
		  for(int i=0; i<L ; i++) {
			  
			  
			  
			  B[i] = 0;
			 
			  do {
			  System.out.print("Enter le valeurd de tableau B(entre 1 et 30) de la case " +(i+1));
			  
			  B[i] = input.nextInt();
		      System.out.println("You entered " + B[i]);
			  

			 }while (B[i] > 30 || B[i] < 1);
			  
			  
			  
		  }
		  input.close();
		  int[] l = solution(A,B);
		  List<Integer> intList = new ArrayList<Integer>(l.length);
		  for (int i : l)
		  {
			  intList.add(i);
		  }
			
		  System.out.println(intList);
		  

	}
	static int ladder(int n) {
		if (n<=1) {
			return n;
		}
		return ladder(n -1) + ladder(n-2);
		
	}
	public static int[] solution(int[] X, int[] Y) {
		int[] S = new int[X.length];
		for  (int i=0; i<X.length; i++) {
			S[i] = ladder(X[i]+1) % (int)Math.pow(2,Y[i]);

			
			
		}
		return S;
		
	}

}
