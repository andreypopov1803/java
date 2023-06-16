package lesson2;

import java.util.Scanner;
        // Дано четное число N и символы c1 и с2
        // Написать метод, который вернет строку длины N,
        // которая состоит из чередующихся символов с1 и с2, начиная с с1.
public class task8 {
    public static void main (String[] args){
        eight();
    }
    private static void eight(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите четное число N: ");

        String s1 = "a";
        String s2 = "b";
        int N = in.nextInt();
        if (N % 2 == 0) {
            System.out.println("Число четное");
            for (int i = 0; i < N / 2; i++) {
                System.out.println(s1);
                System.out.println(s2);
            }
        }
        else{System.out.println("Вы ввели нечетное число");
        }
        in.close();
    }
}
