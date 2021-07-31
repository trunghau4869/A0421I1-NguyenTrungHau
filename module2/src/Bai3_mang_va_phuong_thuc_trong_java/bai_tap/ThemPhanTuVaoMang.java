package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {12, 7, 8, 1, 6, 9};
        System.out.println("nhap so can chen :");
        int number = scanner.nextInt();
        System.out.println("nhap vi tri can chen :");
        int index = scanner.nextInt();
        //int i=arr.length;
        int arr2[] = new int[arr.length + 1];
        boolean flag = false;
        if (index > arr.length) {
            System.out.println("khong tim thay vi tri can chen");
            flag = true;
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (i == index) {
                    arr2[i] = number;
                    break;
                } else {
                    arr2[i] = arr[i];
                }
            }
        }
        for (int index2 = index + 1; index2 < arr2.length; index2++) {
            arr2[index2] = arr[index2 - 1];
        }
        if (!flag)

            System.out.println("mang sau khi them");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }


    }
}

