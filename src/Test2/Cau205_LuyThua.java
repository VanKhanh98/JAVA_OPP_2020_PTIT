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

public class Cau205_LuyThua {

    public static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();

            System.out.println(pow(n,k));
        }
    }

    public static long pow(int n, long k) {

        if (k == 0) {
            return 1;
        }
        long x = (long) pow(n, k / 2);
        if (k % 2 == 0) {
            return x*x%mod;
        }
        return n*(x*x%mod)%mod;
    }

}
