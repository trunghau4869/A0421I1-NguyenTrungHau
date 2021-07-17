package Bai3_mang_va_phuong_thuc_trong_java.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr []= {4, 12, 7, 8, 1, 6, 9};
        System.out.println("nhap so can chen :");
        int number = scanner.nextInt();
        System.out.println("nhap vi tri can chen :");
        int index = scanner.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == index) {
                int temp = 0;
                temp = arr[i];
                arr[i] = number;
                arr[i + 1] = temp;

            }

        }

        System.out.println("mang sau khi them");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

