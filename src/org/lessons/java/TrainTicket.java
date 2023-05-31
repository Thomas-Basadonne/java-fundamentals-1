package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TrainTicket {
    public static void main(String[] args) {
        // declare a Scanner
        Scanner keyboardReader = new Scanner(System.in);

        int Km;
        int Age;

        //override data
        System.out.print("Insert number of Km to do: ");
        Km = keyboardReader.nextInt();
        System.out.print("How old are you?: ");
        Age = keyboardReader.nextInt();

        //System.out.println(Km);
        //System.out.println(Age);

        double TicketPrice = 0;

        if (Age < 18) {
            TicketPrice = (Km * 0.21) * 0.8;
        } else if (Age > 18 && Age < 65) {
            TicketPrice = (Km * 0.21);
        } else if (Age > 65) {
            TicketPrice = (Km * 0.21) * 0.6;
        }

        //DecimalFormat x formattare il prezzo del biglietto con un massimo di due cifre decimali
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedTicketPrice = decimalFormat.format(TicketPrice);

        System.out.println("You have to pay: " + formattedTicketPrice);

    }
}
