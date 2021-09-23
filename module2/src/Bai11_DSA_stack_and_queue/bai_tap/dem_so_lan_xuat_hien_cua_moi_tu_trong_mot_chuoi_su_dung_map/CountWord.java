package Bai11_DSA_stack_and_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong chuỗi : ");
        int n = Integer.parseInt(sc.nextLine());
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + i + "] : ");
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.println("\n"+"-------------------------");

        for (int i = 0; i < n; ++i) {
            if (treeMap.containsKey(strings[i])) {
                treeMap.put(strings[i], treeMap.get(strings[i]) + 1);
            } else {
                treeMap.put(strings[i], 1);
            }
        }

        //Duyet cac phan tu cua TREEMAP
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
