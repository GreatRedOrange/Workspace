package array_exercises;

import java.util.Arrays;
import java.util.Random;

public class SearcherMaxMinAvgValue {

    public static void main(String[] args) {

        int[] arr = new int[5];

        fillArr(arr);
        show(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(getMax(arr) + " man");
        System.out.println(getMin(arr) + " min");
        System.out.println(getAvg(arr));

    }

    private static int[] fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * -10) + 10;
        }
        return arr;
    }

    private static void show(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int average = sum / arr.length;
        return average;
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}


