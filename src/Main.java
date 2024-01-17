import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        double sum = 0;
        final int deposit = 15000;
        int percent = 1;
        int month = 0;
        while (sum < 2459000) {
            sum += (100.0 + percent) / 100 * deposit;
            System.out.printf("Месяц %d, сумма равна %.2f\n", ++month, sum);
        }
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }

        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int population = 12000000;
        int birthRatePer1000People = 17;
        int deathRatePer1000People = 8;
        int populationGrowthPer1000People = birthRatePer1000People - deathRatePer1000People;
        for (int year = 1; year <= 10; year++) {
            population += (population / 1000) * populationGrowthPer1000People;
            System.out.printf("Год %d, численность населения составляет %d\n", year, population);
        }
    }

    public static void task4() {
        double sum = 0;
        final int deposit = 15000;
        final int percent = 7;
        int month = 0;
        while (sum < 12000000) {
            sum += (100.0 + percent) / 100 * deposit;
            System.out.printf("Месяц %d, сумма равна %.2f\n", ++month, sum);
        }
    }

    public static void task5() {
        double sum = 0;
        final int deposit = 15000;
        final int percent = 7;
        int month = 0;
        while (sum < 12000000) {
            sum += (100.0 + percent) / 100 * deposit;
            if (++month % 6 == 0) {
                System.out.printf("Месяц %d, сумма равна %.2f\n", month, sum);
            }
        }
    }

    public static void task6() {
        double sum = 0;
        final int deposit = 15000;
        final int percent = 7;
        int month = 0;
        while (month < 9 * 12) {
            sum += (100.0 + percent) / 100 * deposit;
            if (++month % 6 == 0) {
                System.out.printf("Месяц %d, сумма равна %.2f\n", month, sum);
            }
        }
    }

    public static void task7() {
        int friday = 1 + new Random().nextInt(7);
        for (int day = friday; day <= 31; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо предоставить отчет.\n", day);
        }
    }

    public static void task8() {
        int yearNow = 2024;
        int startYear = yearNow - 200;
        int endYear = yearNow + 100;
        while (startYear++ <= endYear) {
            if (startYear % 79 == 0) {
                System.out.println(startYear);
            }
        }
    }
}