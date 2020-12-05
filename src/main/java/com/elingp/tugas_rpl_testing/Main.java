package com.elingp.tugas_rpl_testing;

import java.util.Arrays;

/**
 * @author ElingP
 */
public class Main {

    public static void main(String[] args) {
        Fungsi1 fungsi1 = new Fungsi1();
        int[] kasusUji1 = {1};
        // ubah inisialisasi j = 1 menjadi j = i + 1
        int[] kasusUji2 = {3, 1};
        int[] kasusUji3 = {10, 8, 9};
        int[] kasusUji4 = {1, 2};
        System.out.println(Arrays.toString(fungsi1.pengurutanSeleksi(kasusUji1)));
        System.out.println(Arrays.toString(fungsi1.pengurutanSeleksi(kasusUji2)));
        System.out.println(Arrays.toString(fungsi1.pengurutanSeleksi(kasusUji3)));
        System.out.println(Arrays.toString(fungsi1.pengurutanSeleksi(kasusUji4)));

        Fungsi2 fungsi2 = new Fungsi2();
        // kasus uji 1
        System.out.println(fungsi2.prima(1));
        // kasus uji 2
        System.out.println(fungsi2.prima(2));
        // kasus uji 3, ubah inisialisasi test = true --> test = false
        System.out.println(fungsi2.prima(4));
        // kasus uji 4, ubah inisialisasi y = ceil(sqrt(x)) --> y = 1
        System.out.println(fungsi2.prima(1));
        // kasus uji 5
        System.out.println(fungsi2.prima(4));
        // kasus uji 6
        System.out.println(fungsi2.prima(3));

        Fungsi3 fungsi3 = new Fungsi3();
        String P = "apa";
        String T = "siapakah penemu lampu?";
        int m = P.length();
        int n = T.length();
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
    }

}
