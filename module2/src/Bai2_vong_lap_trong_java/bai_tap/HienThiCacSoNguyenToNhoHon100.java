package b2.bai_tap;

import java.util.Scanner;

public class HienThiCacSoNguyenToNhoHon100 {
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
