package org.example.array_exercise;

import java.util.Arrays;

public class DeleteFromArr {

    public static void main(String[] args) {

        int testArray[] = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(Arrays.toString(removeFromArr(2, testArray)));

    }

    private static int countsDuplicate(int num, int[] arr) {
        int count = 0;

        for (int j : arr) {
            if (j == num) {
                count++;
            }
        }
        return count;
    }

    private static int[] removeFromArr(int num, int[] arr) {

        int[] temp = new int[arr.length - countsDuplicate(num, arr)];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                temp[k] = arr[i];
                k++;
            }
        }
        return temp;
    }
}
