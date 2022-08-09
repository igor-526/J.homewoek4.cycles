package com.company;

public class Main {

    public static void main(String[] args) {
	    // Задание 1
        int i = 0;
        while (i < 10) {
             i +=1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i=10; i>0; i-=1){
            System.out.print(i + " ");
        }

        //Задание 2
        System.out.println();
        System.out.println();//Для разделения выводов между заданиями
        int day = 5; //Число первой пятницы меясца (натуральное число от 1 до 7)
        int dayCount = 31; //Количество дней в мясце (натуральное число от 1 до 31)
        if (day >= 1 && day <=7){
            if (dayCount >= 1 && dayCount <= 31){
                while (dayCount >= day){
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                    day += 7;
                }
            } else {
                System.out.println("Ошибка! Количество дней в месяце указано неверно!");
            }
        } else {
            System.out.println("Ошибка! Первая пятница недели указана неверно!");
        }

        //Задание 3
        System.out.println();//Для разделения выводов между заданиями
        int year = 2022; //Текущий год
        int yearPr = year - 200; //200 лет до текущего года
        int yearNext = year + 100; //100 лет после текущего года
        for (i = yearPr; i>= yearPr && i<= yearNext; i += 1){
            if (i%79 == 0){
                System.out.println(i);
            }
        }
    }
}
