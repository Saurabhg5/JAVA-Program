package com.assignment;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo
{

	public static void main(String[] args)
	{
		Set hash_set = new HashSet();
		
		hash_set.add(10);
		hash_set.add("Saurabh");
		hash_set.add(null);
		hash_set.add(0);
		hash_set.add(10);
		hash_set.add(true);
		hash_set.addAll(hash_set);
		//hash_set.clear();==>[]
		hash_set.contains("Saurabh");// Used to return true if an element is present in a set.
		hash_set.remove(10);//Used to remove the element if it is present in set.
		hash_set.size();
		hash_set.isEmpty(); // It is used to return true if this set contains no elements.
		
		System.out.println(hash_set);
		
	}

}