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

public class Cau207_DayXauFibonaci {

    static long[] F = new long[93];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= 92; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }

        while (test-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(tim(n, k));
         }

    }

    public static char tim(int n, long k) {
        if(n==1) return 'A';
        if(n==2) return 'B';
        if (k <= F[n - 2]) {
            return tim(n - 2, k);
        }
        return tim(n - 1, k - F[n - 2]);
    }

}
