/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau309_BacThang {
    public static long log = 1000000007;
    public static long[] ar = new long[100001];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 2; i < 100001; i++)
            {
                ar[i] = 0;
            }
            ar[0] = 1;
            ar[1] = 1;
            for (int i = 2; i <= k; i++)
            {
                for (int j = 0; j <= i - 1; j++) 
                {
                    ar[i] += ar[j];
                    ar[i] = ar[i] % log;
                }
            }

            for (int i = k + 1; i <= n; i++) {
                for (int j = i - k; j <= i - 1; j++)
                {
                    ar[i] += ar[j];
                    ar[i] = ar[i] % log;
                }
            }
            System.out.println(ar[n]);
            m--;
        }
    }
}
