package org.Abstraction;

import java.util.Scanner;

public class Arryin_java {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter the number of elements in the array: ");
		    int n = scanner.nextInt();

		    System.out.print("Enter the elements of the array: ");
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		      arr[i] = scanner.nextInt();
		    }

		    System.out.print("Enter the sum of the two elements: ");
		    int sum = scanner.nextInt();

		    System.out.println("The following pairs of elements add up to 7:");
		    for (int i = 0; i < n; i++) {
		      for (int j = i + 1; j < n; j++) {
		        if (arr[i] + arr[j] == sum) {
		          System.out.println("(" + arr[i] + ", " + arr[j] + ")");
		        }
		      }
		    }
		  }
}
