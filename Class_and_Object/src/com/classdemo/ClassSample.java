package com.classdemo;

class ABC
{
	class PQR //nested class
	{
		
	}
}

class StudentDetails// pascle case//,employee,car,college,Teacher, ABC 
{
		//data member//attributes/state/properties/variable
		int studentId;//camel case 4 byte
		String studentName;   // aprrox char which it includes
		
		float marks;               //4 byte = 8+2=10 bytes
	//method //member Functions
		
		public void store()
		{
			int id=0;//local variable
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
		public void viewStudentData()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
		public void editStudentData()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
		public void viewOneStudentData()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
			System.out.println("One student record can fetch");
			
		}
		public void marksOfStudent()
		{
			//body of the method
			//Write a logic to store the student Id name address emailid
		}
}


public class ClassSample {

	public static void main(String[] args) {
		StudentDetails obj1=new StudentDetails();// 10 byte object creation
		//new keywork is responsible to occupy memory in java
		//how much memory allocated by object?
		
		obj1.viewOneStudentData();
		System.out.println("Student Id "+ obj1.studentId);
		obj1.marksOfStudent();
		
		StudentDetails obj2=new StudentDetails(); //10 bytes
		
		StudentDetails obj3=new StudentDetails();//10 bytes // object
		StudentDetails obj4; //no memory allocation for object 4 // reference
		
	}

}

