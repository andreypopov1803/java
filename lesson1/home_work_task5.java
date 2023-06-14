package lesson1;

import java.util.Scanner;

public class home_work_task5 {
    public static void main(String[] args) {
        five();
    }
        //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    private static void five() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int num = in.nextInt();
        int max = 0;
        int min = 1000;
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 20);
            System.out.println(array[i]);
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
        in.close();
    }
}
