package test.cinema;

import org.junit.jupiter.api.Test;

import static main.cinema.Cinema.*;
import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {

    @Test
    public void testIncomeSmallCinema() {
        assertEquals(200, countIncome(4, 5, 10));
    }

    @Test
    public void testTotalIncomeSmallCinema() {
        assertEquals(200, countTotalIncome(4, 5));
    }

    @Test
    public void testTotalIncomeBigCinema() {
        assertEquals(648, countTotalIncome(8, 9));
    }

    @Test
    public void testTotalIncomeBigCinema2() {
        assertEquals(560, countTotalIncome(9, 7));
    }

    @Test
    public void testIncomeNoSeats() {
        assertEquals(0, countIncome(4, 0, 10));
    }

    @Test
    public void testIncomeNoRows() {
        assertEquals(0, countIncome(0, 10, 10));
    }
}