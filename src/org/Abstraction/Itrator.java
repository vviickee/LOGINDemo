package org.Abstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        List<String> fruits = new ArrayList<>();
	        
	        // Adding elements to the list
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");
	        
	        // Creating an iterator for the list
	        Iterator<String> iterator = fruits.iterator();
	        
	        // Using the iterator to iterate through the list
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            System.out.println(fruit);
	        }
	    }
	} 
