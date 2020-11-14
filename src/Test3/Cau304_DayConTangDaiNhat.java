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
public class Cau304_DayConTangDaiNhat {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n , sophantu;
        
        int a[] = new int[100010];
        int b[] = new int[100010];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        b[1] = 1;
        sophantu = 1;
        for (int i = 2; i <= n; i++) 
        {
            if (a[i] < a[b[1]])
            {
                b[1] = i;
            } 
            else if (a[i] > a[b[sophantu]]) 
            {
                sophantu++;
                b[sophantu] = i;
            } 
            else 
            {
                int l = 1, r = sophantu;
                while (l < r) 
                {
                    int mid ;
                    mid = (l + r + 1) / 2;
                    
                    if (a[i] > a[b[mid]]) 
                    {
                        l = mid;
                    }
                    else 
                    {
                        r = mid - 1;
                    }
                }
                int mid = l;
                if (a[i] > a[b[mid]] && a[i] < a[b[mid + 1]]) 
                {
                    b[mid + 1] = i;
                }
            }
        }
        System.out.println(sophantu);
    }
}