package Bai2_vong_lap_trong_java.bai_tap.hien_thi_20_so_nguyen_to_dau_tien;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int count = 0;

        for (int j = 2; j < 500; j++) {
            int i = 2;
            boolean check = true;
            while (i < j) {
                if (j % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.printf(j + " ");
                count++;
            } else {
                continue;
            }
            if (count == number) {
                break;
            }
        }


    }
}
