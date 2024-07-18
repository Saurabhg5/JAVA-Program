package com.javacore.demo;

public class ArrayInJava7 {

	public static void main(String[] args) {
		int[][] a = {
	            {1, -2, 3}, 
	            {-4, -5, 6, 9}, 
	            {7}, 
	        };
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}

	}
// use for each loop for the above matrix to dispaly the matrix
	// initialize a 3d array in Java
	
}

