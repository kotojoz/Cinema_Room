package main.cinema;

public class Application {
    private static boolean isWorking = true;

    private static void mainMenu() {
        int rows = Inputs.enterRowsCount();
        int seats = Inputs.enterSeatsCount();

        Cinema cinema = new Cinema(rows, seats);

        while (isWorking) {
            int command = Inputs.enterCommand();

            switch (command) {
                case 1 -> cinema.printCinema();
                case 2 -> cinema.buyTicket();
                case 3 -> cinema.showStatistics();
                case 0 -> isWorking = false;
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
