package com.recepkabakci.corejava;

public class CyclicRotation {
	
	public static  int[] solution(int[] A, int K) {
		 int temp[] = new int[A.length];
		 
	        // Copying first A.length element in array temp
	        for (int i = 0; i < A.length; i++)
	            temp[i] = A[i];
	 
	        // Moving the rest element to index
	        // zero to K-A.length
	        for (int i = A.length-1; i < K; i++) {
	            A[i - A.length+1] = A[i];
	        }
	 
	        // Copying the temp array element
	        // in original array
	        for (int i = 0; i <  A.length; i++) {
	           A[i + K -  A.length+1] = temp[i];
	        }	    
       return temp;
    }

	public static void main(String[] args) {
		int A[]= {1,2,3,4};
		System.out.println(solution(A, 3));
	}

}
