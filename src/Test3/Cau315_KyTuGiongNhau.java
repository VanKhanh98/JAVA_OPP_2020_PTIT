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
public class Cau315_KyTuGiongNhau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scannner = new Scanner(System.in);
        int nhap = scannner.nextInt();
        while(nhap > 0){
            int n = scannner.nextInt();
            // insert
            int I = scannner.nextInt();
            //Delete
            int D = scannner.nextInt();
            //Coping
            int C = scannner.nextInt();
            //
            int[] time_min = new int[n + 5];
            time_min[0] = 0;
            time_min[1] = I;
            for (int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    time_min[i] = Math.min(time_min[i - 1] + I, time_min[(i + 1) / 2] + C + D);
                }
                else
                {
                    time_min[i] = Math.min(time_min[i - 1] + I, time_min[i / 2] + C);
                }
            }
            System.out.println(time_min[n]);
            nhap--;
        }
    }
}
