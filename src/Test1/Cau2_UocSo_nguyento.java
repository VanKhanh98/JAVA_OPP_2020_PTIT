/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;
import java.util.Scanner;
/**
 *
 * @author VANKHANH-PC
 */
public class Cau2_UocSo_nguyento {

    /**
     * @param args the command line arguments
     */

    public static long timUocNto(long n) {

        long max = -1;

        while (n % 2 == 0) {
            max = 2;
            n = n/2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                max = i;
                n = n / i;
            }
        }

        if (n > 2)
            max = n;

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test -- > 0) {
            long n = in.nextLong();
            System.out.println(timUocNto(n));
        }

    }

}
