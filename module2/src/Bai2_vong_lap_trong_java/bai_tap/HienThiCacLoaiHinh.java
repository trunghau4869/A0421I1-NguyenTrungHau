package Bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.printf("\n");
                        for (int j = 0; j < 7; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        System.out.printf("\n");
                        for (int j = 0; j < i; j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    for(int i=5;i>=1;i--) {
                        System.out.printf("\n");
                        for(int j=1;j<=i;j++) {
                            System.out.printf("* ");
                        }
                    }
                    System.out.println("\n");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
