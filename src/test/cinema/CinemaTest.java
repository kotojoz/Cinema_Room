package test.cinema;

import main.cinema.Cinema;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {

    public Cinema smallCinema = new Cinema(4, 5);
    public Cinema bigCinema = new Cinema(9, 7);

    @Test
    public void testPriceSmallCinemaFrontSeats() {
        assertEquals(10, smallCinema.calculatePrice(4));
    }

    @Test
    public void testPriceSmallCinemaBackSeats() {
        assertEquals(10, smallCinema.calculatePrice(1));
    }

    @Test
    public void testPriceBigCinemaBackSeats() {
        assertEquals(8, bigCinema.calculatePrice(6));
    }

    @Test
    public void testPriceBigCinemaFrontSeats() {
        assertEquals(10, bigCinema.calculatePrice(4));
    }

    @Test
    public void testTotalIncomeSmallCinema() {
        assertEquals(200, smallCinema.calculateTotalIncome());
    }

    @Test
    public void testTotalIncomeBigCinema() {
        assertEquals(560, bigCinema.calculateTotalIncome());
    }
}