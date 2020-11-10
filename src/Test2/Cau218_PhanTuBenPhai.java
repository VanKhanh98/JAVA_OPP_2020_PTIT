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

public class Cau218_PhanTuBenPhai {

    public static void main(String[] args) {
         Scanner in= new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = in.nextLong();
            for (int i = 0; i < n-1; i++) {
                int j = i + 1;
                while (j < n && arr[j] <= arr[i]) j++;
                if (j == n) System.out.print("-1 ");
                else {
                    arr[i] = arr[j];
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("-1");
        }
    }
    
}
