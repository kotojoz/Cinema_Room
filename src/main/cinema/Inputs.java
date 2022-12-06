package main.cinema;

import java.util.Scanner;

public class Inputs {

    public static int enterRowsCount() {
        System.out.println("Enter the number of rows:");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }

    public static int enterSeatsCount() {
        System.out.println("Enter the number of seats in each row:");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }

    public static int enterRowNumber() {
        System.out.println("Enter a row number:");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }

    public static int enterSeatNumber() {
        System.out.println("Enter a seat number in that row:");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}
