package com.elingp.tugas_rpl_testing;

public class Fungsi1 {

    int[] pengurutanSeleksi(int[] s) {
        int i, j, imaks, temp;
        int n = s.length;
        for (i = n - 1; i >= 2; i--) {
            imaks = 1;
            for (j = 2; j <= i; j++) {
                if (s[j] > s[imaks]) {
                    imaks = j;
                }
            }
            temp = s[i];
            s[i] = s[imaks];
            s[imaks] = temp;
        }
        return s;
    }

}
