package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

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
        double priceKm = 0.21;
        double youngSale = 0.8;
        double oldSale = 0.6;

        if (Age < 18) {
            TicketPrice = (Km * priceKm) * youngSale;
        } else if (Age > 18 && Age < 65) {
            TicketPrice = (Km * priceKm);
        } else if (Age > 65) {
            TicketPrice = (Km * priceKm) * oldSale;
        }

        //DecimalFormat x formattare il prezzo del biglietto con un massimo di due cifre decimali
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedTicketPrice = decimalFormat.format(TicketPrice);

        System.out.println("You have to pay: " + formattedTicketPrice);

    }
}
