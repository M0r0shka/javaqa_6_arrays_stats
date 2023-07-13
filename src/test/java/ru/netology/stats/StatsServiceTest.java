package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void getTotalSum() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.totalSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAverageSum() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMaxSales() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMinSales() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBelowAverageSales() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAboveAverageSales() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
