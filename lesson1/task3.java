package lesson1;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        tree();
    }

    //Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    // а остальные - равны ему.
    private static void tree() {
        int[] nums = new int[]{7, 3, 2, 2, 3, 7};
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
