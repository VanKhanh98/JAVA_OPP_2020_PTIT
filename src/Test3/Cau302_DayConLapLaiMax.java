/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author VANKHANH-PC
 */
public class Cau302_DayConLapLaiMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner (System.in);
        int in = scanner.nextInt();
        while(in>0){
            int F[][]=new int[101][101];
            int day = 0;
            for(int i=0;i<101;i++)
            {
                for(int j=0;j<101;j++)
                {
                    F[i][j]=0;
                }
            }
            int ss = scanner.nextInt();
                     scanner.nextLine();
            //
            String str = scanner.nextLine();
            for(int i=1;i<=str.length();i++)
            {
                for(int j=1;j<=str.length();j++)
                {
                    if(str.charAt(i-1)==str.charAt(j-1)&&i!=j)
                    {
                        F[i][j]=F[i-1][j-1]+1;
                    }
                    else{
                        F[i][j]=Math.max(F[i-1][j], F[i][j-1]);
                    }
                    day = Math.max(day, F[i][j]);
                }
            }
            System.out.println(day);
            in--;
        }
    }
}