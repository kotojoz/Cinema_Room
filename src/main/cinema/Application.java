package main.cinema;

public class Application {

    public static void main(String[] args) {
        int rows = Inputs.enterRowsCount();
        int seats = Inputs.enterSeatsCount();
        Cinema cinema = new Cinema(rows, seats);
        cinema.printCinema();
        cinema.buyTicket();
        cinema.printCinema();
    }
}
