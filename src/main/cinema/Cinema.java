package main.cinema;

import java.util.Arrays;

public class Cinema {
    private final int ROWS;

    private final int SEATS_IN_ROW;

    private final int FRONT_SEATS_PRICE = 10;

    private final int BACK_SEATS_PRICE = 8;

    private final int totalSeats;

    private final int totalIncome;

    private int currentIncome;

    private int purchasedTickets;

    private char[][] cinema;

    public int getTotalIncome() {
        return totalIncome;
    }

    public Cinema(int rows, int seatsInRow) {
        this.ROWS = rows;
        this.SEATS_IN_ROW = seatsInRow;
        this.totalSeats = ROWS * SEATS_IN_ROW;
        this.totalIncome = calculateTotalIncome();
        this.currentIncome = 0;
        this.purchasedTickets = 0;
        createCinema();
    }

    //Create 2 dimension array and fill it with 'S'
    private void createCinema() {
        cinema = new char[ROWS][SEATS_IN_ROW];
        for (char[] rows : cinema) {
            Arrays.fill(rows, 'S');
        }
    }

    public int calculateTotalIncome() {
        if (totalSeats <= 60) {
            return ROWS * SEATS_IN_ROW * FRONT_SEATS_PRICE;
        } else {
            int frontHalf = ROWS / 2;
            int backHalf = ROWS - frontHalf;
            return frontHalf * SEATS_IN_ROW * FRONT_SEATS_PRICE +
                    backHalf * SEATS_IN_ROW * BACK_SEATS_PRICE;
        }
    }

    //Calculate price for  the row
    public int calculatePrice(int row) {
        if (totalSeats <= 60) {
            return FRONT_SEATS_PRICE;
        } else {
            if (row <= ROWS / 2) {
                return FRONT_SEATS_PRICE;
            } else {
                return BACK_SEATS_PRICE;
            }
        }
    }

    public void buyTicket() {
        while (true) {
            int row = Inputs.enterRowNumber();
            int seat = Inputs.enterSeatNumber();

            if (row > ROWS || seat > SEATS_IN_ROW) {
                System.out.println("Wrong input!");
            } else if (cinema[row - 1][seat - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
            } else {
                cinema[row - 1][seat - 1] = 'B';
                currentIncome += calculatePrice(row);
                purchasedTickets++;
                System.out.printf("\n Ticket price: $%d\n", calculatePrice(row));
                break;
            }
        }
    }

    public void printCinema() {
        System.out.println("\nCinema:");
        System.out.print(" ");
        for (int i = 1; i <= SEATS_IN_ROW; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < cinema.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double calculatePercentage() {
        if (purchasedTickets == 0) {
            return 0.00;
        } else {
            return (purchasedTickets * 100d) / totalSeats;
        }
    }

    public void showStatistics() {
        System.out.printf("\nNumber of purchased tickets: %d\n", purchasedTickets);
        System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
        System.out.printf("Current income: $%d\n", currentIncome);
        System.out.printf("Total income: $%d\n", totalIncome);
    }
}
