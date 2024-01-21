package org.Abstraction;

import java.util.ArrayList;

public class scanner {
	public static void main(String[] args ) {
    ArrayList<String>fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    System.out.println("Fruits: " + fruits);
    int size = fruits.size();
    System.out.println("Number of fruits: " + size);
    String firstFruit = fruits.get(0);
    System.out.println("First fruit: " + firstFruit);
    fruits.set(1, "Grapes");
    System.out.println("Updated fruits: " + fruits);
    fruits.remove(2);
    System.out.println("Fruits after removing: " + fruits);
    boolean containsBanana = fruits.contains("Banana");
    System.out.println("Contains Banana? " + containsBanana);
    System.out.println("All fruits:");
    for (String fruit : fruits) {
        System.out.println(fruit);
    }
    fruits.clear();
    System.out.println("Fruits after clearing: " + fruits);
}
}