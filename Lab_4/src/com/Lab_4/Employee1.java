package com.Lab_4;

public class Employee1 
{

	private String name;
	private String role;
	
	public Employee1(String name,String role)
	{
		this.name=name;
		this.role=role;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public double calculateSalary()
	{
		return 0.0;
	}
}

class Manager extends Employee1
{
	private double sal;
	
	public Manager(String name, double sal)
	{
		super(name,"Manager");
		this.sal=sal;
		
	}
	
	public double calculateSalary()
	{
		return sal;
	}
}

class Programmer extends Employee1
{
	private double sal;
	
	public Programmer(String name, double sal)
	{
		super(name,"Programmer");
		this.sal=sal;
	}
	
	public double calculateSalary()
	{
		return sal;
	}
}

public class Employee
{

	public static void main(String[] args)
	{
		Employee1 emp1 = new Manager("Nivedita",60000);
		Employee1 emp2 = new Programmer("Harsh",60000);
		
		System.out.println("Manager:"+emp1.getName()+"\n Role:" +emp1.getRole()+"\nSalary:RS."+emp1.calculateSalary());
		System.out.println("Programmer:"+emp2.getName()+"\n Role:" +emp2.getRole()+"\nSalary:RS."+emp2.calculateSalary());
	}
	

}
