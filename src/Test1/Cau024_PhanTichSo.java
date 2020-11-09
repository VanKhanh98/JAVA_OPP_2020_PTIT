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
public class Cau024_PhanTichSo {

    static int n, tmp;
    static int[] arr = new int[30];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            n = in.nextInt();
            tmp = 0;
            PhanTich(n);
            System.out.println();
        }
    }

    public static void PhanTich(int k) {
        if (k < 1) {
            return;
        }
        for (int i = (n - tmp) / k; i >= 0; i--) {
            arr[k] = i;
            tmp += i * k;
            if (tmp == n) {
                System.out.print("(");
                for (int j = n; j >= k; j--) {
                    for (int z = 1; z <= arr[j]; z++) {
                        System.out.print(j);
                        if (z < arr[j] || j > k) {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.print(") ");
            } else {
                PhanTich(k-1);
            }
            tmp -= i * k;
            arr[k] = 0;
        }
    }

}
