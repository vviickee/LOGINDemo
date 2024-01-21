package org.Abstraction;

import java.util.LinkedList;

public class TestBank {    
	public static void main(String[]args) {
		LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        System.out.println("Numbers: " + numbers);
        int size = numbers.size();
        System.out.println("Number of elements: " + size);
        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);
        numbers.set(1, 20);
        System.out.println("Updated numbers: " + numbers);
        numbers.remove(2);
        System.out.println("Numbers after removing: " + numbers);
        boolean contains10 = numbers.contains(10);
        System.out.println("Contains 10? " + contains10);
        System.out.println("All numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
        numbers.clear();
        System.out.println("Numbers after clearing: " + numbers);
    }
	}
			
		

