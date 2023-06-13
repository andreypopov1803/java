package lesson1;

public class task1 {
    public static void main(String[] args) {
        one();
    }

    //Подсчитать максимальное количество подряд идуших единиц в данном массиве
    private static void one() {
        int[] arr = new int[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int j : arr) {
            if (j == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
