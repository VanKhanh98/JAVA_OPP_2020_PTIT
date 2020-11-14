/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;


import java.util.Scanner;


public class Cau301_xauconchungmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int m = sc.nextInt();
        sc.nextLine();
        
        
        while(m-->0)
        {
            int F[][] = new int[1005][1005];
            //
            int day = 0;
            for(int i=0;i<1005;i++)
            {
                for(int j=0;j<1005;j++)
                {
                    F[i][j]=0;
                }
            }
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            
            for(int i=1;i<=str1.length();i++)
            {
                for(int j=1;j<=str2.length();j++)
                {// lấy ký tự ở vị trí trong dãy bắt đầu từ o
                    if(str1.charAt(i-1)==str2.charAt(j-1))
                    {
                        F[i][j]=F[i-1][j-1]+1;
                    }
                    else{ // tìm so lon nhat guia hai day
                        F[i][j]=Math.max(F[i-1][j], F[i][j-1]);
                    }
                    //day dai nhat
                    day=Math.max(day, F[i][j]);
                }
            }
            System.out.println(day);
            
        }
    }
}
