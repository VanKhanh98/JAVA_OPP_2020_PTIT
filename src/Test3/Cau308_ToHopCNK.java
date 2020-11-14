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
public class Cau308_ToHopCNK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       long ar[][]=new long[1005][1005];
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i=0;i<=1000;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==j||j==0)
                {
                    ar[i][j]=1;
                }
                else
                {
                    ar[i][j]=ar[i-1][j-1]+ar[i-1][j];
                }
                ar[i][j]%=1000000007;
            }
        }
        while(m-->0){
            int n= sc.nextInt();
            int k=sc.nextInt();
            
            System.out.println(ar[n][k]);

        }
    }
}