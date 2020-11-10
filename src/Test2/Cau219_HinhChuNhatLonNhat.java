/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

/**
 *
 * @author VANKHANH-PC
 */
import java.util.Scanner;

public class Cau219_HinhChuNhatLonNhat {

    static long[] arr = new long[100009];
    static long kq;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextLong();
            }
            kq = 0;
            Try(1, n);
            System.out.println(kq);
        }

    }

    public static void Try(int k, int z) {
        if (k > z) {
            return;
        }
        int viTri = k;
        for (int i = k; i <=z; i++) {
            if (arr[i] < arr[viTri]) {
                viTri = i;
            }
        }
        kq = Math.max(kq, arr[viTri] * (z - k + 1L));
        Try(k, viTri - 1);
        Try(viTri + 1, z);
    }
}
