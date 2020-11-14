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
public class Cau305_TongSoLonNhat_DayConTangDan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
       int m = scanner.nextInt();
       while(m-- >0 ){
          int n = scanner.nextInt();
          int [] arr = new int [n+5];
          long day = 0;
           // 
           for (int i = 1; i <= n; i++) {
               arr[i] = scanner.nextInt();   
           }
          long [] length = new long[1005];
           for (int i = 0; i <= n; i++) {
               length[i] = arr[i];
                     for (int j = 1; j < i; j++) {
                    if (arr[i] > arr[j]) length[i] = Math.max(length[i], length[j] + arr[i]);
                }
                day = Math.max(day, length[i]);
            }
            System.out.println(day);
        }
    }
}
