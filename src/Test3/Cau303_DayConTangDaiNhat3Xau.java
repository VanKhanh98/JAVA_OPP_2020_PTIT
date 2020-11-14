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
public class Cau303_DayConTangDaiNhat3Xau {
    
    static String day1, day2 , day3; 
    static int x,y,z;
    static int[][][] f;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0) 
        {
            x = sc.nextInt();y = sc.nextInt();z = sc.nextInt();
            sc.nextLine();
            String str;
             str = sc.nextLine();
            String[] Str = str.split(" ");
            
            f = new int[x + 3][y + 3][z + 3];
            day1 = Str[0];day2 =Str[1];day3 = Str[2];
            Try();
        }
    }
    public static void Try() {
        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= y; j++) 
            
            {
                for (int k = 1; k <= z; k++) 
                {
                    char temp = day1.charAt(i-1);
                    if (
                   (temp == day2.charAt(j - 1)) && (temp == day3.charAt(k-1)))
                    {
                        f[i][j][k] = f[i-1][j-1][k-1]+1;
                    }
                    else {
                        f[i][j][k] = Math.max(f[i][j][k-1],
                                     Math.max(f[i-1][j][k],f[i][j-1][k]));
                    }
                }
            }
        }
        System.out.println(f[x][y][z]);
    }

}

