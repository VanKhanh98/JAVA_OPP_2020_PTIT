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

public class Cau023_MayATM {

    static int s,n,dem;
    static int[] arr = new int[31];

    public static void Try(int i,long sum,int c) {
        if (i>n) return;
        Try(i + 1, sum, c);
        if (sum + arr[i] < s) {
            if (c + 1 < dem) {
                Try(i + 1, sum + arr[i], c + 1);
            }
        } else {
            if (sum + arr[i] == s) {
                dem = Math.min(dem,c+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        while (test-- > 0) {
            n = in.nextInt();
            s = in.nextInt();
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }
            dem = 31;
            Try(1,0,0);
            if (dem == 31) {
                System.out.println(-1);
            } else {
                System.out.println(dem);
            }
        }
    }

}
