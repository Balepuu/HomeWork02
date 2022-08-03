public class Main {
    public static void main(String[] args) {
        System.out.println("Пишем наше ДЗ!!");
        System.out.println("Делаем коммит и пуш");
        System.out.println("Переходим в бгидхаб");

        //Задание 1
        byte jupiter = 3;
        short mars = 9;
        int mercury = 11;
        long moon = 135L;
        float neptune = 20.5f;
        double pluto = 200.5;
        boolean jupiterIsBig = jupiter > 6;
        char bar = 35;
        System.out.println(jupiterIsBig);

        //Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксёров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксёров " + weightDifference);

        //Задание 3
        int bananas = 80;
        int milk = 105;
        int iceCreamSundae = 100;
        int rawEggs = 70;

        int weightGram = bananas * 5 + milk * 2 + iceCreamSundae * 2 + rawEggs * 4;
        System.out.println("Вес в граммах " + weightGram);
        System.out.println("Вес в килограммах " + (double)weightGram/1000);

        //Задание 4
        int weightDeal = 7000;
        int dietFirst = 250;
        int dietSecond = 500;
        double firstResult = Math.ceil((double) weightDeal / dietFirst);
        double secondRecult = Math.ceil((double) weightDeal / dietSecond);
        System.out.println("Спортсмен сбросит по первой диете 7 кг через - "+ (int)firstResult + " дней");
        System.out.println("Спортсмен сбросит по второй диете 7 кг через - "+ (int)secondRecult + " дней");
        System.out.println("В среднем на диету уйдёт -" + (firstResult + secondRecult)/2 + " день");

        //Задание 5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristySalary = 76230;

        double increasedSalaryMasha = (double) mashaSalary / 100 * 10 + mashaSalary;
        double increasedSalaryDenis = (double) denisSalary / 100 * 10 + denisSalary;
        double increasedSalaryKristy = (double) kristySalary / 100 * 10 + kristySalary;

        System.out.println("Разница в годовом доходе Маши составляет - "+(increasedSalaryMasha-mashaSalary)*12);
        System.out.println("Разница в годовом доходе Дениса составляет - "+(increasedSalaryDenis-denisSalary)*12);
        System.out.println("Разница в годовом доходе Кристи составляет - "+(increasedSalaryKristy-kristySalary)*12);

    }
}