package ru.netology.stats;

public class StatsService {
    public int calculateTotalSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double calculateAverageSales(int[] sales) {
        return (double) calculateTotalSales(sales) / sales.length;
    }

    public int findMonthWithMaxSales(int[] sales) {
        int maxSales = 0;
        int monthWithMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                monthWithMaxSales = i + 1;
            }
        }
        return monthWithMaxSales;
    }

    public int findMonthWithMinSales(int[] sales) {
        int minSales = sales[0];
        int monthWithMinSales = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                monthWithMinSales = i + 1;
            }
        }
        return monthWithMinSales;
    }

    public int calculateMonthsBelowAverageSales(int[] sales) {
        double averageSales = calculateAverageSales(sales);
        int monthsBelowAverageSales = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                monthsBelowAverageSales++;
            }
        }
        return monthsBelowAverageSales;
    }

    public int calculateMonthsAboveAverageSales(int[] sales) {
        double averageSales = calculateAverageSales(sales);
        int monthsAboveAverageSales = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                monthsAboveAverageSales++;
            }
        }
        return monthsAboveAverageSales;
    }
}
