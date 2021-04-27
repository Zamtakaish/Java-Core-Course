package exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {

        //This block is automatically calls close() method on the Scanner variable
        // when exception is occurred (Java 7 feature).
        try (Scanner scanner = new Scanner(System.in)) {

            int[] numbers = {12, 2, 3, 4};

            int number = numbers[21];
        }
    }
}
