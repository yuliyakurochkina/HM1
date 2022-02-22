package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        byte a = 126;
        short b = 225;
        int i = 1221;
        long c = 3000000L;

        float f = 55.5f;
        double d = 225.303;


        //Задание 2
        double theFirstBoxerWeight = 78.2;
        double theSecondBoxerWeight = 82.7;

        double totalWeight = theFirstBoxerWeight + theSecondBoxerWeight;
        System.out.println("Общий вес двух бойцов составляет " + totalWeight + " кг.");

        double differenceBetweenWeights = theSecondBoxerWeight % theFirstBoxerWeight;
        System.out.println("Разница между весами бойцов: " + differenceBetweenWeights + " кг.");
        System.out.println();

        //Задание 3
        int banana = 80;
        int milk = 105;
        int icecream = 100;
        int egg = 70;

        int cocktail = (banana * 5) + (milk * 2) + (icecream * 2) + (egg * 4);
        int cocktailkg = cocktail / 1000;
        System.out.println("Вес спорт-завтрака составляет " + cocktailkg + " кг.");
        System.out.println();

        //Задание 4
        int weightLoss = 7000;
        int weightLossPerDay1 = 250;
        int result1 = weightLoss / weightLossPerDay1;
        System.out.println("Спортсмен потеряет 7 кг за " + result1 + " дней при потере веса " + weightLossPerDay1 + " гр/день.");

        int weightLossPerDay2 = 500;
        int result2 = weightLoss / weightLossPerDay2;
        System.out.println("Спортсмен потеряет 7 кг за " + result2 + " дней при потере веса " + weightLossPerDay2 + " гр/день.");

        int averageNumberOfDaysToLoseWeight = (result1 + result2) / 2;
        System.out.println("В среднем спортсмену понадобится " + averageNumberOfDaysToLoseWeight + " день для того, чтобы сбросить 7 кг.");
        System.out.println();

        //Задание 5
        int mashaMonthSalary = 67760;
        int denisMonthSalary = 83690;
        int kristinaMonthSalary = 76230;

        int mashaYearSalary = mashaMonthSalary * 12;
        int denisYearSalary = denisMonthSalary * 12;
        int kristinaYearSalary = kristinaMonthSalary * 12;

        int mashaMonthSalaryAfter = mashaMonthSalary * 110 / 100;
        int denisMonthSalaryAfter = denisMonthSalary * 110 / 100;
        int kristinaMonthSalaryAfter = kristinaMonthSalary * 110 / 100;

        int mashaYearSalaryAfter = mashaMonthSalaryAfter * 12;
        int denisYearSalaryAfter = denisMonthSalaryAfter * 12;
        int kristinaYearSalaryAfter = kristinaMonthSalaryAfter * 12;

        int differenceMasha = mashaYearSalaryAfter - mashaYearSalary;
        int differenceDenis = denisYearSalaryAfter - denisYearSalary;
        int differenceKristina = kristinaYearSalaryAfter - kristinaYearSalary;

        System.out.println("Годовая зарплата Маши после повышения: " + mashaYearSalaryAfter + " рублей. Годовой доход Маши вырос на " + differenceMasha + " рублей.");
        System.out.println("Годовая зарплата Дениса после повышения: " + denisYearSalaryAfter + " рублей. Годовой доход Дениса вырос на " + differenceDenis + " рублей.");
        System.out.println("Годовая зарплата Кристины после повышения: " + kristinaYearSalaryAfter + " рублей. Годовой доход Кристины вырос на " + differenceKristina + " рублей.");
    }
}
