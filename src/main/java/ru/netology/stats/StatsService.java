package ru.netology.stats;

public class StatsService {

    //1.Сумма всех продаж в месяц
    public long totalSum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum = totalSum + sale;
        }
        return totalSum;
    }

    //2.Средняя сумма всех продаж в месяц
    public long averageSum(long[] sales) {
        long averageSum = totalSum(sales) / sales.length;

        return averageSum;
    }

    //3.Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { //в рассматриваемом i-м месяце продаж больше
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    //4.Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { //в рассматриваемом i-м месяце продаж меньше
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    //5.Количество месяцев, в которых продажи были ниже среднего
    public int belowAverageSales(long[] sales) {
        long averageSum = averageSum(sales);
        int belowAverageMonth = 0; // переменная для подсчёта количества месяцев с продажами ниже среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) { //в рассматриваемом i-м месяце продаж меньше
                belowAverageMonth = belowAverageMonth + 1;
            }
        }

        return belowAverageMonth;
    }

    //6.Количество месяцев, в которых продажи были выше среднего
    public int aboveAverageSales(long[] sales) {
        long averageSum = averageSum(sales);
        int aboveAverageMonth = 0; // переменная для подсчёта количества месяцев с продажами выше среднего

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) { //в рассматриваемом i-м месяце продаж меньше
                aboveAverageMonth = aboveAverageMonth + 1;
            }
        }

        return aboveAverageMonth;
    }

}
