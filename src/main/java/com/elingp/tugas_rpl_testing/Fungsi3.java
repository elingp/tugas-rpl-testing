package com.elingp.tugas_rpl_testing;

public class Fungsi3 {

    int pencocokanString(String P, String T, int n, int m) {
        int i = 0;
        boolean ketemu = false;
        while ((i <= n - m) && (!ketemu)) {
            int j = 0;
            while ((j < m) && (P.charAt(j) == T.charAt(i + j))) {
                j += 1;
            }
            if (j == m) {
                ketemu = true;
            } else {
                i += 1;
            }
        }
        if (ketemu) {
            return i + 1;
        } else {
            return -1;
        }
    }

}
