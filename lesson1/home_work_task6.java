package lesson1;

import java.util.Scanner;

public class home_work_task6 {
    public static void main(String[] args) {
        six();
    }
        //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    private static void six() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество столбцов и строк: ");
        int num = in.nextInt();
        int[][] array = new int[num][num];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = (int) Math.round(Math.random() * 9);
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
