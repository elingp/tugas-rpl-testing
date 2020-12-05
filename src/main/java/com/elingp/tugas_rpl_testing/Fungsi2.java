package com.elingp.tugas_rpl_testing;

public class Fungsi2 {

    boolean prima(int x) {
        int y;
        boolean test;

        if (x < 2) {
            return false;
        } else {
            if (x == 2) {
                return true;
            } else {
                y = (int) Math.ceil(Math.sqrt(x));
                test = true;
                while (test && (y >= 2)) {
                    if (x % y == 0) {
                        test = false;
                    } else {
                        y -= 1;
                    }
                }
                return test;
            }
        }
    }

}
