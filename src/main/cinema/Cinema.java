package main.cinema;

import java.util.Scanner;

public class Cinema {
    private static final int frontSeatsPrice = 10;
    private static final int backSeatsPrice = 8;
    public static Scanner scanner = new Scanner(System.in);

    public static int countIncome(int rows, int seats, int price) {
        return rows * seats * price;
    }

    public static int countTotalIncome(int numberOfRows, int numberOfSeats) {
        if (numberOfSeats * numberOfRows <= 60) {
            return countIncome(numberOfRows, numberOfSeats, frontSeatsPrice);
        } else {
            int frontHalf = numberOfRows / 2;
            int backHalf = numberOfRows - frontHalf;
            return countIncome(frontHalf, numberOfSeats, frontSeatsPrice)
                    + countIncome(backHalf, numberOfSeats, backSeatsPrice);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = scanner.nextInt();
        System.out.println("Total income:");
        System.out.println("$" + countTotalIncome(numberOfRows, numberOfSeats));
    }
}
