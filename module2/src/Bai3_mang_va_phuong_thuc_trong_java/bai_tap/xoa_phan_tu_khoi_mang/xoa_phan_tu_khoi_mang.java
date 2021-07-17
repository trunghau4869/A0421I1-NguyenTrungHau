package Bai3_mang_va_phuong_thuc_trong_java.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("nhap so can xoa :");
        int number = scanner.nextInt();

        for (i = 0; i < size; i++) {
            if (array[i] == number) {
                break;
            }
        }
        for (int j = i; j < size - 1; j++)
        {
            array[j] = array[j + 1];
        }
        for (i = 0; i < size; i++) {
        System.out.printf(array[i]+" ");
    }}
}
