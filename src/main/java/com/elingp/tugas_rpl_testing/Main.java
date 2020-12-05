package com.elingp.tugas_rpl_testing;

import java.util.Arrays;

/**
 * @author ElingP
 */
public class Main {

    public static void main(String[] args) {
        Fungsi1 fungsi1 = new Fungsi1();
        int[] arr = {1, 3, 2, 5, 4, 10, 9, 8, 7, 6};
        int[] sortedArr = fungsi1.pengurutanSeleksi(arr);
        System.out.println(Arrays.toString(sortedArr));

        Fungsi2 fungsi2 = new Fungsi2();
        for (int i = 1; i <= 10; i++) {
            System.out.println(fungsi2.prima(i));
        }
    }

}
