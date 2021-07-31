package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap so luong phan tu:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("so luong qua 20 phan tu");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap so thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("nhap so can xoa :");
        int number = scanner.nextInt();
        boolean check = false;

        for (i = 0; i < array.length; i++) {
            if (array[i] == number) {
                check = true;
                for (int j = i; j < array.length- 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        if (check) {
            for (i = 0; i < array.length-1; i++) {
                System.out.printf(array[i] + " ");
            }
        }else {
            System.out.println("khong co gia tri trong mang");
        }
    }
}
