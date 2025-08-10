package com.wipro.basic;

public class Ex13 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4,5};
        int length = removeDuplicates(arr);
        System.out.println("Length after removing duplicates: " + length);
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int count = 1; // First element is always unique

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[count] = arr[i];
                count++;
            }
        }

        return count;
    }
}
