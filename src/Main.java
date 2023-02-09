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
        System.out.println("Задача 1");
        int monthlySave = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total += monthlySave;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int year = 0;
        int birthrateOnThousand = 17;
        int deathRateOnThousand = 8;
        int populationGrowthOnThousand = birthrateOnThousand - deathRateOnThousand;
        int thousand = 1000;
        while (year < 10) {
            year++;
            populationY = ((populationY / thousand) * populationGrowthOnThousand) + populationY;
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int monthlySave = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            month++;
            total = total + total / 100 * 7;
            total = total + monthlySave;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthlySave = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            month++;
            total = total + total / 100 * 7;
            total = total + monthlySave;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int monthlySave = 15000;
        int total = 0;
        int month = 0;
        while (month <= 9 * 12) {
            month++;
            total = total + total / 100 * 7;
            total = total + monthlySave;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        int date = friday;
        System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        while (friday < 31) {
            friday = friday + 1;
            if ((friday - date) % 7 == 0) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int presentYear = 2023;
        int twoHundredBefore = presentYear - 200;
        int hundredForward = presentYear + 100;
        int cycle = 79;
        while (twoHundredBefore <= hundredForward) {
            twoHundredBefore++;
            if (twoHundredBefore % cycle == 0) {
                System.out.println(twoHundredBefore);
            }
        }
    }
}
