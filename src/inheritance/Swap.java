package inheritance;


public class Swap {
public static void main(String[] args) {
	int number = 12345;

    System.out.println("Before swapping: " + number);
    int lastTwoDigits = number % 100;
    number /= 100;
    int swappedNumber = number * 100 + (lastTwoDigits % 10) * 10 + lastTwoDigits / 10;
    System.out.println("After swapping: " + swappedNumber);
}

}
