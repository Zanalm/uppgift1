package a15cecal_uppgift1;

import java.util.Arrays;
import java.util.Scanner;


public class ScanIntegers {

// scan is a function that scans text and parses it
// Scanner is declared as a local variable 
// Scanner is then closed in the end of the function
// Asks the user to decide how many numbers to input than puts the value in an array
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers do you want to sort?");
    int[] IntArray = getIntegers(scanner.nextInt());
    IntArray = sortIntegers(IntArray);
    printIntegers(IntArray);
    scanner.close();

}

// Scanner2 is declared, than closed as for the first one
// Tells the number the user wrote in earlier, and asks for the numbers to be sorted
public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " numbers with a space between them.");
    int[] values = new int[number];
	Scanner scanner2 = new Scanner(System.in);
    for (int i = 0; i < values.length; i++) {
        values[i] = scanner2.nextInt();
    }
    scanner2.close();
    return values;
}

public static int[] sortIntegers(int[] unsorted) {
	// Copies the specified array with the copyOf and truncates it
    int[] numbers = Arrays.copyOf(unsorted, unsorted.length);

    // Pushes the smallest number down
    for (int n = numbers.length - 1; n > 0; n--) {
        for (int i = 0; i < n; i++) {
            if (numbers[i] < numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
    }
    return numbers;
}

// writes out all the sorted numbers
public static void printIntegers(int[] array){
    for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
    }
}
}