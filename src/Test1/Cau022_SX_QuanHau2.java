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

public class Cau022_SX_QuanHau2 {

    public static int[][] a = new int[10][10];
    public static int[] x = new int[35];
    public static int[] row = new int[35];
    public static int[] cross1 = new int[35];
    public static int[] cross2 = new int[35];
    public static int n;
    public static int ds;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            n = 8;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i <= 2 * n; i++) {
                row[i] = 0;
                cross1[i] = 0;
                cross2[i] = 0;
            }
            ds = 0;
            Try(1);
            System.out.println(ds);
        }
    }

    public static void Try(int k) {
        if (k > n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += a[i][x[i]];
            }
            if (sum > ds) {
                ds = sum;
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (row[i] == 0 && cross1[i + k] == 0 && cross2[i - k + n] == 0) {
                x[k] = i;
                row[i] = 1;
                cross1[i + k] = 1;
                cross2[i - k + n] = 1;
                Try(k + 1);
                row[i]=0;
                cross1[i + k] = 0;
                cross2[i - k + n] = 0;
            }
        }
    }

}
