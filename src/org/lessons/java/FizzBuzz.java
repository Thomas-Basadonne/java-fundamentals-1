package org.lessons.java;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit;

        // Chiedi all'utente quanti numeri vuole stampare
        do {
            System.out.print("Quanti numeri vuoi stampare? (1-1000): ");
            limit = scanner.nextInt();
        } while (limit <= 0 || limit > 1000);

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
