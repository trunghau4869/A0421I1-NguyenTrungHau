package Bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu trong mang");
        int size=scanner.nextInt();
        int[] array;
        array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("nhap phan tu thu "+i);
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        for(int i=1;i<size;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
