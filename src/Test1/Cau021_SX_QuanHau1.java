/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

/**
 *
 * @author VANKHANH-PC
 */
import java.util.Scanner;

public class Cau021_SX_QuanHau1 {

    static int n, kq;
    static int[] arr = new int[35];
    static int[] row = new int[35];
    static int[] cross1 = new int[35];
    static int[] cross2 = new int[35];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            n = in.nextInt();
            for (int i = 0; i < 2 * n; i++) {
                row[i] = 0;
                cross1[i] = 0;
                cross2[i] = 0;
            }
            kq = 0;
            Try(1);
            System.out.println(kq);
        }

    }

    public static void Try(int k) {
        if (k > n) {
            kq++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (row[i] == 0 && cross1[i + k] == 0 && cross2[i - k + n] == 0) {
                arr[k]=i;
                row[i]=1;
                cross1[i + k] = 1;
                cross2[i - k + n] = 1;
                Try(k + 1);
                row[i] = 0;
                cross1[i + k] = 0;
                cross2[i - k + n] = 0;
            }
        }
    }

}
