
// Задание

// Пусть дан произвольный список целых чисел.

// 1) Найти максимальное значение
// 2) Найти минимальное значение
// 3) Найти среднее значение
// 4) Нужно удалить из него чётные числа

public class home_work_task12 {
    public static void main(String[] args) {
        int average = 0;
        int sum = 0;
        int min = 100;
        int max = 0;
        int [] mas = {11, 3, 14, 16, 7};
        System.out.print("Все нечетные элементы этого массива: ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max){
                max = mas[i];
            }
            if (mas[i] < min){
                min = mas[i];
            }
            sum = sum + mas[i];
            if (mas[i] % 2 == 1) {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Минимальное число массива: " + min);
        average = sum / mas.length;
        System.out.println("Среднее значение массива: " + average);
    }
}
