package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang");
        int size = scanner.nextInt();
        System.out.println("nhap so cot");
        int size1 = scanner.nextInt();
        double array[][];
        array = new double[size][size1];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.println("nhap phan tu hang " + i + " cot " + j);
                array[i][j] =  scanner.nextDouble();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }

        double sum = 0;
        System.out.println("nhap so cot can tinh tong");
        int cot = scanner.nextInt();
        if (cot >= size1) {
            System.out.println("khong tim thay cot nay");
        } else {
            for (int i = 0; i < size; i++) {
                sum += array[i][cot];
            }
            System.out.println("tong cac phan tu trong cot " + cot + " la " + sum);
        }

    }
}
