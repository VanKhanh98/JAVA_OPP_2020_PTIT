/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author VANKHANH-PC
 */
public class Cau313_XemPhim {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int m;
        int n;
        m = sc.nextInt();
        n = sc.nextInt();
        int a[] = new int [n+1];
        int b[][] = new int[n+1][m+1];
        for (int i = 1; i <= n; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.fill(b[0], 0);
        //
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++)
            {
                b[i][j] = b[i-1][j];
                if(
                    j >= a[i] && (b[i][j] < b[i-1][j-a[i]]+a[i]
                    ))
                {
                    b[i][j] = b[i-1][j-a[i]] + a[i];
                }
            }
        }
        System.out.println(b[n][m]);
    }
    
}