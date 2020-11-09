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
public class Cau18_TapHop {

    static int n, x, tmp;
    static int[] a = new int[30];
    static int[] c = new int[30];
    static boolean ok;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        in.nextLine();

        while (test-- > 0) {
            n = in.nextInt();
            x = in.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            ok = true;
            tmp = 0;
            Try(1);
            if (ok) {
                System.out.println(-1);
            } else {
                System.out.println("]");
            }
        }
    }

    public static void Try(int idx) {
        if (idx > n) {
            return;
        }
        for (int i = (x - tmp) / a[idx]; i >= 0; i--) {
            c[idx] = i;
            tmp += i * a[idx];
            if (tmp == x) {
                if (ok) {
                    System.out.print("[");
                    ok = false;
                } else System.out.print("][");
                for (int j = 1; j <= idx; j++) {
                    for (int k = 1; k <= c[j]; k++) {
                        System.out.print(a[j]);
                        if (k < c[j] || j < idx) {
                            System.out.print(" ");
                        }
                    }
                }
            } else {
                Try(idx + 1);
            }
            tmp -= i * a[idx];
            c[idx] = 0;
        }
    }

}
