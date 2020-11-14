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
public class Cau306_SoBuocItNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while (m-- > 0) {
            int lenght = scanner.nextInt();
            //
            int[] arr = new int[lenght + 5];
            int[] day = new int[lenght + 5];
            int buoc = 0;

            for (int i = 1; i <= lenght; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 1; i <= lenght; i++) 
            {
                day[i] = 1;
                for (int j = 1; j < i; j++) 
                {
                    if (arr[i] >= arr[j])
                    day[i] = Math.max(day[i], day[j] + 1);
                }
                buoc = Math.max(buoc, day[i]);
            }
            System.out.println(lenght - buoc);
        }
    }
}
