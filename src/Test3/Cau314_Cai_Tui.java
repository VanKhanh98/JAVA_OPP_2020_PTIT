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
public class Cau314_Cai_Tui {
    static int[] A;
    static int[] C;
    //
    static int N;
    static int V;
    //
    static long[][] lonhonV;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int soluong = scanner.nextInt();

        while (soluong > 0) 
        {
            N = scanner.nextInt();
            V = scanner.nextInt();
            //cap phát
            lonhonV = new long[1003][1003];
            A = new int[1003];
            C = new int[1003];

            for (int i = 1; i <= N; i++) 
            {
                A[i] = scanner.nextInt();
            }

            for (int i = 1; i <= N; i++) 
            {
                C[i] = scanner.nextInt();
            }
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= V; j++)
                {
                    lonhonV[i][j] = 0;
                }
            }
            System.out.println(Try());
            soluong-- ;
        }
    }
    public static long Try() {
        long kq = 0;
        for (int i = 1; i <= N; i++) {
            lonhonV[i][A[i]] = Math.max(C[i], lonhonV[i - 1][A[i]]);
            for (int L = 1; L <= V; L++) {
                lonhonV[i][L] = Math.max(lonhonV[i - 1][L], lonhonV[i][L]);
                if (lonhonV[i - 1][L] != 0 && L + A[i] <= V) {
                    lonhonV[i][L + A[i]] = Math.max(lonhonV[i][L + A[i]], lonhonV[i - 1][L] + C[i]);
                }
                kq = Math.max(kq, lonhonV[i][L]);
            }
        }
        return lonhonV[N][V];
    }
}
