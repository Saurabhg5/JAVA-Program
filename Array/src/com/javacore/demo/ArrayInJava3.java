package com.javacore.demo;

import java.util.Arrays;

public class ArrayInJava3 {

	public static void main(String[] args) {
		//Declaring and initializing an array of ints
		int[] a= {12, 21, 0,5,7};
		//creating a copy of array 'a' using copyOf() method of java.util.Arrays class
		int[] b=Arrays.copyOf(a, a.length);
		
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		 //Now changing values of one array will not reflect in other array

		a[2]=56;
		System.out.println(b[2]);//value of 3rd element in array 'b' will not change
		
		b[4]=100;
		System.out.println(a[4]);//value of 5th element in array 'a' will not change
	}

}
