package com.assignment;
import java.util.TreeSet;
import java.util.*;  
class TreeSetEx
{  
	public static void main(String args[])
	{  
		//Creating and adding elements  
		TreeSet<String> al=new TreeSet();  
		TreeSet<String> ae=new TreeSet(); 
		ae.add("Dhoni");
		ae.add("Rohit");
		ae.add("Virat");
		al.add("Sachin");  // add() method
		al.add("Hardik");  
		al.add("Raina");  // We can add duplicate BUT not print in output
		al.add("Shami");  
		//al.add(null); // We cannot add Null value
		
		System.out.println("Elements of the TreeSet:");
        for (String element : al) 
        {
            System.out.println(element);
        }
		System.out.println(al);  
		
		Object obj=al.clone();	// clone() Method
		System.out.println(obj);
		
		//al.clear(); 	// clear() Method
		//System.out.println(al);
		
		
		System.out.println(al.contains("Raina"));	//contains() method
		System.out.println(al.size());
		System.out.println(al.first());
		System.out.println(ae.last());
		System.out.println(al.higher("Shami"));	//returns the closest greatest element
		System.out.println(al.lower("Hardik")); 	//returns the closest least element
		
		System.out.println(ae);
		ae.pollFirst();		//retrieve and remove the lowest(first) element.
		System.out.println(ae);
		ae.pollLast();		//retrieve and remove the highest(last) element.
		System.out.println(ae);
		ae.clear(); 		// clear() Method
		System.out.println(ae);
		
	}  
}  