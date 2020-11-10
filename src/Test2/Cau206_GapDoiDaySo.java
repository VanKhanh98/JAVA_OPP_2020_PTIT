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

public class Cau206_GapDoiDaySo {

    static int n;
    static long[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {

            n = in.nextInt();
            arr = new long[n+1];
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = (long)2*arr[i-1]+1;
            }
            long k = in.nextLong();
            System.out.println(tim(n,k));
        }

    }

    public static int tim(int n, long k) {
        if(n==1) return 1;
        long ind = arr[n-1]+1;
        if (k == ind) {
            return n;
        } else if (k > ind) {
            return tim(n-1,k-ind);
        } else return tim(n - 1, ind - k);
    }

}
