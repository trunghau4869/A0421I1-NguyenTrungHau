package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang va cot");
        int size = scanner.nextInt();
        double array[][];
        array = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("nhap phan tu hang " + i + " cot " + j);
                array[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i][i];

        }
        double sum1 = 0;
        int i = 0;
        for (int j = size - 1; j >= 0; j--) {
            sum1 += array[i][j];
            i++;

        }

        System.out.println("tong so cac phan tu o duong cheo chinh tu trai qua phai la :" + sum);
        System.out.println("tong so cac phan tu o duong cheo chinh tu phai qua trai la :" + sum1);
    }

}
