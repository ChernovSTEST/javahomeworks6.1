package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    void shouldCalculateTotalSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalSales = 180;

        StatsService statsService = new StatsService();
        int actualTotalSales = statsService.calculateTotalSales(sales);

        Assertions.assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    void shouldCalculateAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageSales = 15;

        StatsService statsService = new StatsService();
        double actualAverageSales = statsService.calculateAverageSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    void shouldFindMonthWithMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthWithMaxSales = 6;

        StatsService statsService = new StatsService();
        int actualMonthWithMaxSales = statsService.findMonthWithMaxSales(sales);

        Assertions.assertEquals(expectedMonthWithMaxSales, actualMonthWithMaxSales);
    }

    @Test
    void shouldFindMonthWithMinSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthWithMinSales = 9;

        StatsService statsService = new StatsService();
        int actualMonthWithMinSales = statsService.findMonthWithMinSales(sales);

        Assertions.assertEquals(expectedMonthWithMinSales, actualMonthWithMinSales);
    }

    @Test
    void shouldCalculateMonthsBelowAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsBelowAverageSales = 5;

        StatsService statsService = new StatsService();
        int actualMonthsBelowAverageSales = statsService.calculateMonthsBelowAverageSales(sales);

        Assertions.assertEquals(expectedMonthsBelowAverageSales, actualMonthsBelowAverageSales);
    }

    @Test
    void shouldCalculateMonthsAboveAverageSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsAboveAverageSales = 5;

        StatsService statsService = new StatsService();
        int actualMonthsAboveAverageSales = statsService.calculateMonthsAboveAverageSales(sales);

        Assertions.assertEquals(expectedMonthsAboveAverageSales, actualMonthsAboveAverageSales);
    }
}
