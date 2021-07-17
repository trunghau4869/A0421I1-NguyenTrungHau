package Bai2_vong_lap_trong_java.bai_tap.hien_thi_cac_so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int j = 0; j < 100; j++) {
            if (j < 2) {
                continue;
            } else {
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
                    System.out.printf(j + ", ");
                    count++;
                } else
                    continue;

            }
        }

    }
}
