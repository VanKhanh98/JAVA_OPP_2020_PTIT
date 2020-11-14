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
public class Cau312_XauDoiXung2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner  scanner = new Scanner(System.in);
        int m =  scanner.nextInt();
         scanner.nextLine();
        while (m > 0) {
            String str =  scanner.nextLine();
            int n = str.length();
            int[][] arr =new int[n + 2][n + 2];
            
            for (int i = 1; i <= n; i++) 
            {
                arr[i][i] = 1;
            }
            for (int a = 1; a <= n - 1; a++) 
            {
                for (int i = 1; i <= n - a; i++) 
                {
                    int j = i + a;
                    if (str.charAt(i-1) == str.charAt(j-1))
                    {
                        arr[i][j] = arr[i + 1][j - 1] + 2;
                    }
                    else 
                    {
                        arr[i][j] = Math.max(arr[i][j - 1], arr[i + 1][j]);
                    }
                }
            }
            System.out.println(n-arr[1][n]);
            m--;
        }
    }
}
