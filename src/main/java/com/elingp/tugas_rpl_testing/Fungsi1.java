package com.elingp.tugas_rpl_testing;

/**
 * @author ElingP
 */
public class Fungsi1 {

    int[] pengurutanSeleksi(int[] s) {
        int i, j, imaks, temp;
        for (i = s.length - 1; i > 0; i--) {
            imaks = 0;
            for (j = 1; j <= i; j++) {
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
