package day0111;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = removeByIndex(arr,2);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] removeByIndex(int[] array, int index) {
        int[] temp = new int[0];
        for (int i = 0; i < size(array); i++) {
            if (i != index) {
                temp = add(temp, get(array, i));
            }
        }

        return temp;
    }
    public static int[] add(int[] array, int element) {
        int[] temp = new int[size(array) + 1];
        for (int i = 0; i < size(array); i++) {
            temp[i] = get(array, i);
        }
        temp[size(array)] = element;

        return temp;
    }
    public static int get(int[] array, int index) {
        return array[index];
    }
    public static int size(int[] array) {
        return array.length;
    }
}
