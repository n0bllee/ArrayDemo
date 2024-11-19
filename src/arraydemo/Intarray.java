package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class Intarray {
    // Method to sort an array of integers in ascending order
    public static void sortIntegers(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Integers: " + Arrays.toString(arr));
    }

    // Method to sort an array of strings alphabetically
    public static void sortStrings(String[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Strings: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for integers
        System.out.println("Enter the number of integers to sort:");
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Original Integers: " + Arrays.toString(intArray));
        sortIntegers(intArray);

        // Input for strings
        System.out.println("\nEnter the number of strings to sort:");
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] stringArray = new String[m];
        System.out.println("Enter " + m + " strings:");
        for (int i = 0; i < m; i++) {
            stringArray[i] = scanner.nextLine();
        }
        System.out.println("Original Strings: " + Arrays.toString(stringArray));
        sortStrings(stringArray);

        scanner.close();
    }
}

