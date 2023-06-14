package lesson1;

import java.util.Scanner;

public class home_work_task6 {
    public static void main(String[] args) {
        six();
    }
        //2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
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
