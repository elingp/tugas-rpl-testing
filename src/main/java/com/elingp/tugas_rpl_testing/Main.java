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
        String P, T;
        int n, m;
        // kasus uji 1, ubah inisialisasi i = 0 --> i = 7
        P = "apa";
        T = "siapakah penemu lampu?";
        m = 4;
        n = 10;
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
        // kasus uji 2, ubah inisialisasi i = 0 --> i = 7 & ketemu = false --> ketemu = true
        P = "apa";
        T = "siapakah penemu lampu?";
        m = 4;
        n = 10;
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
        // kasus uji 3, ubah inisialisasi ketemu = false --> ketemu = true
        P = "apa";
        T = "siapakah penemu lampu?";
        m = 4;
        n = 10;
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
        // kasus uji 4, ubah inisialisasi i = 0 --> i = 6 & j = 0 --> j = 5
        P = "apa";
        T = "siapakah penemu lampu?";
        m = 4;
        n = 10;
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
        // kasus uji 5
        P = "apa";
        T = "siapakah penemu lampu?";
        m = P.length();
        n = T.length();
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
        // kasus uji 6
        P = "he";
        T = "hahahahaha";
        m = P.length();
        n = T.length();
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
        // kasus uji 7
        P = "haha";
        T = "hahahahaha";
        m = P.length();
        n = T.length();
        System.out.println(fungsi3.pencocokanString(P, T, n, m));
    }

}
