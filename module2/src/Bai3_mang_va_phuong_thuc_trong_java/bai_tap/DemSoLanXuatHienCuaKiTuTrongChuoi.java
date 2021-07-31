package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        String string = "nguyen trung hau";
        DemKiTu(string);
    }

    public static void DemKiTu(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ki tu can dem : ");
        char str = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (str == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("so lan xuat hien cua " + str + " la " + count);
    }
}
