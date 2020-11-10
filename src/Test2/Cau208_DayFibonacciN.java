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

public class Cau208_DayFibonacciN {

    public static long[][] F = new long[2][2];
    public static long[][] M = new long[2][2];
    public static long mod = 1000000007;

    public static void mul(long[][] f, long[][] m) {
        long a = (f[0][0]*m[0][0]%mod+f[0][1]*m[1][0]%mod)%mod;
        long b = (f[0][0]*m[0][1]%mod+f[0][1]*m[1][1]%mod)%mod;
        long c = (f[1][0]*m[0][0]%mod+f[1][1]*m[1][0]%mod)%mod;
        long d = (f[1][0]*m[0][1]%mod+f[1][1]*m[1][1]%mod)%mod;
        F[0][0] = a;
        F[0][1] = b;
        F[1][0] = c;
        F[1][1] = d;
    }

    public static void pow(long[][] f, long n) {
        if(n<=1) return;
        pow(f,n/2);
        mul(f,f);
        if (n % 2 == 1) {
            mul(F, M);
        }
    }

    public static void reset() {
        F[0][0] = F[0][1]= F[1][0] = 1;
        M[0][0] = M[0][1] = M[1][0] = 1;
        F[1][1] = M[1][1] = 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            long n = in.nextLong();
            reset();
            pow(F,n-1);
            System.out.println(F[0][0]);
        }
    }

}
