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
public class Cau317_TongBinhPhuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scaner = new Scanner(System.in);
        int m = scaner.nextInt();
        while(m-->0){
            int bp= scaner.nextInt();
            long arr[] = new long[bp+5];
            for(int i=0;i<=bp;i++){
                arr[i]=i;
            }
            for(int i=1;i<=bp;i++)
            {
                for(int j=1;j<=Math.sqrt(i);j++)
                {
                    arr[i]=Math.min(arr[i], arr[i-j*j]+1);
                }
            }
            System.out.println(arr[bp]);
            
            
        }
    }
}