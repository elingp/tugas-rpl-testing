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
        int number = 10;
        for (int i = 1; i <= number; i++) {
            System.out.println(fungsi2.prima(i));
        }

        Fungsi3 fungsi3 = new Fungsi3();
        String P = "apa";
        String T = "siapakah penemu lampu?";
        int m = P.length();
        int n = T.length();
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
    }

}
