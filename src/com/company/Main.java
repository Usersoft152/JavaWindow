package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double count_emp, hours, rate, pay;

        Scanner input = new Scanner(System.in);

        count_emp = 0; // пока не обработан ни один сотрудник
        while (count_emp < 7) { // проверка значения count_emp
            System.out.print("Введите отработанные часы: ");
            hours = input.nextDouble();
            System.out.print("Введите часовую ставку в рублях: ");
            rate = input.nextDouble();
            pay = hours * rate;
            System.out.println("Зарплата равна " + pay + " руб.");
            ++count_emp; // переход к следующему сотруднику
        }
        System.out.println("\nВсе сотрудники обработаны.\n");
        System.out.println("\nСпасибо за внимание !\n");


    }
}



