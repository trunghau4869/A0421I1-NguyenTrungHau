package Bai14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {6, 5, 4, 7, 1, 9};
        for (int i = 1; i < array.length; i++) {
            int insertSort = array[i];
            int j = -1;
            for (; j >= 0 && array[j] > insertSort; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = insertSort;
        }
        for(int list:array){
            System.out.println(list);
        }
    }

}

