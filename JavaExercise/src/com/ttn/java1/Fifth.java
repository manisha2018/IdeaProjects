//Find common elements between two arrays.

package com.ttn.java1;

public class Fifth {
    public static void main(String a[]) {
        int[] arr1 = {4, 7, 22, 9, 2, 10};
        int[] arr2 = {3, 2, 12, 9, 40, 32, 4};
        int arr3[] = new int[arr1.length < arr2.length ? arr1.length : arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[i] = arr1[i];
                    System.out.println("Common Elements are: " + arr3[i]);
                }
            }

        }

    }
}

