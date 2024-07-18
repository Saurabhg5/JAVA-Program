package com.javacore.demo;

public class ArrayInJava5 {

	public static void main(String[] args) {
		int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
		 
        //Creating an array object of same length as array 'a'
 
        int[] b = new int[a.length];
        
      //creating a copy of array 'a' using arraycopy() method of System class
        
        System.arraycopy(a, 0, b, 0, a.length);
        
        for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
        //change the value of an array and see the result
        // print the array
        
	}

}

