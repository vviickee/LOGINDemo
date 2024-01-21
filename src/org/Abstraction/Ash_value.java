package org.Abstraction;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Ash_value {

	public static void main(String[] args) {
		// Create a HashMap to store key-value pairs
        Map<String, Integer> ageMap = new ConcurrentHashMap<>();

        // Add key-value pairs to the map
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);

        // Access values by their keys
        int aliceAge = ageMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Check if a key exists in the map
        boolean hasKey = ageMap.containsKey("Dave");
        System.out.println("Does Dave exist in the map? " + hasKey);

        // Iterate through the map
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + "'s age is " + entry.getValue());
        }

	}

}
