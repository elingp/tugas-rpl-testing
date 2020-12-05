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
    }

}
