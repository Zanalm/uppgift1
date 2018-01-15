package a15cecal_uppgift1;

import java.util.Arrays;
import java.util.Scanner;


//scans text and parse it
public class ScanIntegers {
private static Scanner scanner = new Scanner(System.in);
private static Scanner scanner2 = new Scanner(System.in);

// Asks the user to decide how many numbers to input than puts the value in an array
public static void main(String[] args) {
    System.out.println("How many numbers do you want to sort?");
    int[] IntArray = getIntegers(scanner.nextInt());
    IntArray = sortIntegers(IntArray);
    printIntegers(IntArray);

}

// Tells the number the user wrote in earlier, and asks for the numbers to be sorted
public static int[] getIntegers(int number) {
    System.out.println("Enter " + number + " numbers.");
    int[] values = new int[number];

    for (int i = 0; i < values.length; i++) {
        values[i] = scanner2.nextInt();
    }
    return values;
}

public static int[] sortIntegers(int[] unsorted) {
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