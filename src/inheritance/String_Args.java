package inheritance;

public class String_Args {
	public static void main(String[] args) {
        // Creating strings
        String greeting = "Hello, ";
        String name = "John";

        // Concatenating strings
        String message = greeting + name;

        // Displaying the result
        System.out.println(message);

        // Finding the length of a string
        int length = message.length();
        System.out.println("Length of the message: " + length);

        // Checking if a string contains a substring
        boolean containsJohn = message.contains("John");
        System.out.println("Contains 'John': " + containsJohn);

        // Extracting a substring
        String subMessage = message.substring(0, 5); // Extract "Hello"
        System.out.println("Substring: " + subMessage);

        // Converting to uppercase
        String upperCaseMessage = message.toUpperCase();
        System.out.println("Uppercase: " + upperCaseMessage);
    }
}
