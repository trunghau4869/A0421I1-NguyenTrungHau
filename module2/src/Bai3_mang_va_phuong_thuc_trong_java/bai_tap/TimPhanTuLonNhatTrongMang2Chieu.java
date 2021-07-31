package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so hang");
        int size = scanner.nextInt();
        System.out.println("nhap so cot");
        int size1 = scanner.nextInt();

        int array[][] = new int[size][size1];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.println("nhap so thu " + j + " hang " + i);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.printf("\n");
        }
        int max = array[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("so lon nhat trong mang la "+max);
    }
}
