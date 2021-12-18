package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //task1(in);
        //task2(in);
        //task3(in);


    }

    private static void task3(Scanner in) {
        System.out.println("Введи сумму денежного вклада:");
        double sum = in.nextDouble();
        System.out.println("Введи процент годовых:");
        double proc = in.nextDouble();
        System.out.println("Введи длительность вклада(лет):");
        int years = in.nextInt();
        double vrem=0;

        for (int i=1;i<=years;i++)
        {
          vrem= sum*Math.pow(1+((proc/100)/12),12*i);
            System.out.println("В "+ i+ " год вы получите:"+ vrem+" грн");
            System.out.println("Начисленные проценты в этом году:" + (vrem-sum));
        }
    }

    private static void task2(Scanner in) {
        System.out.println("Введите числа:");
        int[] myArray = new int[10];
        int sumChis=0;
        for(int i=0;i<myArray.length;i++)
        {
           myArray[i] = in.nextInt();
            sumChis+=myArray[i];

        }
        System.out.println("Средняя арифметическая:"+ sumChis/myArray.length);
    }

    private static void task1(Scanner in) {
        System.out.println("Приветсствую, введи два числа:");
        int num1 = in.nextInt();
        System.out.println("--------");
        int num2 = in.nextInt();
        System.out.println("Средняя арифметическая:"+(num2+num1)/2);
    }
}
