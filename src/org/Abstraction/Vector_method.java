package org.Abstraction;

import java.util.Vector;

public class Vector_method {
	public static void main(String[]args) {
		Vector<Integer> vector = new Vector();{
		int firstElement = vector.get(0);
        System.out.println("First Element: " + firstElement);

        // Update an element in the vector
        vector.set(1, 25);

        // Remove an element from the vector
        vector.remove(2);
		}
        // Iterate through the vector
        System.out.println("Vector elements:");
        for (Integer element : vector) {
            System.out.println(element);
        }

        // Check if the vector contains a specific element
        if (vector.contains(25)) {
            System.out.println("Vector contains 25.");
        }

        // Get the size of the vector
        int size = vector.size();
        System.out.println("Vector size: " + size);
    }

	}


