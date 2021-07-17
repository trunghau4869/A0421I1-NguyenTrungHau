package Bai3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {4, 12, 7, 8, 1, 6, 9};
        int[] arr2 = {5, 9, 17, 81, 15, 7, 79};
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[arr1.length] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
