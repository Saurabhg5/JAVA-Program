package com.javacore.demo;

public class ArrayInJava {

	public static void main(String[] args) {
		int[] a= {12, 21,0, 5,7};//Declaring and initializing an array of ints
		
		int[] b=a;
		
		//printing the data
		for(int i=0; i< b.length;i++)   //1  1<5
		{
			System.out.println(b[i]);   //b[1]=12,21.. so on
					
		}
		
		  a[2]=52; // changing the value of 3rd element of array a
		  System.out.println("==========");
		  System.out.println(b[2]);
		  
		  b[4]=100; //Changing value of 5th element of array 'b'
		  System.out.println(a[4]);
		
		/*int[] a= {12, 21,0, 5,7};
		int[] b=new int[a.length];//Declaring and instantiating another array of ints with same length

		int[] a;
		int a[];
		int[] a=new int[10];
		
		for(int i=0; i<a.length;i++)// copying a array variable in b array variable using for loop
		{
			b[i]=a[i];             // i=1 1<5
					                   //b[1]=a[1]
					                		  // b[0]=12
					                		   //b[1]=21
		}
		a[2]=56;//Changing value of 3rd element in array 'a'
		System.out.println(b[2]);//value of 3rd element in array 'b' will not change
		
		b[4] = 100;*/
		
	}
		
		

}

