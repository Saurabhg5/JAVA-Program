package com.interfacedemo;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		/*int age = 30;
		int physics = 97;
		int chem = 98;
		int eng = 95;
		
		int[] marks = new int[3];
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		
		System.out.println(marks[0]);
		*/
		
		int[] marks = new int[3];
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		
		//length
		System.out.println(marks.length);
		
		//sort
		//95, 97, 98
		System.out.println(marks[0]);
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		
	}

}
