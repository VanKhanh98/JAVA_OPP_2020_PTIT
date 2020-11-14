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
public class Cau307_ConEch {
    static int nhay;
    static long[] arr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        arr = new long[101];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        //
        for (int i = 4; i <= 100; i++) 
        {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        while (m-- > 0) {
            nhay = sc.nextInt();
            System.out.println(arr[nhay]);
        }
    }
}
