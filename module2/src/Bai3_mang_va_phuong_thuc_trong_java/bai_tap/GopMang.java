package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhap phan tu thu " + i + " cua mang 1");
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[7];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhap phan tu thu " + i + " cua mang 2");
            arr2[i] = scanner.nextInt();
        }
        int length = arr1.length + arr2.length;
        int num = 0;
        int[] arr3 = new int[length];
        for (int x : arr1) {
            arr3[num] = x;
            num++;
        }
        for (int x : arr2) {
            arr3[num] = x;
            num++;
        }
        System.out.println("mang sau khi gop la :");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}

