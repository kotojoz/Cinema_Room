package main.cinema;

import java.util.Scanner;

public class Inputs {

    private final static Scanner scanner = new Scanner(System.in);

    public static int enterRowsCount() {
        System.out.println("Enter the number of rows:");
        return scanner.nextInt();
    }

    public static int enterSeatsCount() {
        System.out.println("Enter the number of seats in each row:");
        return scanner.nextInt();
    }

    public static int enterRowNumber() {
        System.out.println("Enter a row number:");
        return scanner.nextInt();
    }

    public static int enterSeatNumber() {
        System.out.println("Enter a seat number in that row:");
        return scanner.nextInt();
    }

    public static int enterCommand() {
        System.out.println("""

                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit""");
        return scanner.nextInt();
    }
}
