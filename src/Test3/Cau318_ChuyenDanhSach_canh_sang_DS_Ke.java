/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau318_ChuyenDanhSach_canh_sang_DS_Ke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        while(m-->0){
            int c=sc.nextInt();
            int k=sc.nextInt();
            
            ArrayList<Integer> until[]=new ArrayList[1001];
            for(int i=0;i<=c;i++)
            {
                until[i]=new ArrayList<Integer>();
            }
            for(int i=0;i<k;i++){
                int s1= sc.nextInt();
                int s2= sc.nextInt();
                until[s1].add(s2);
                until[s2].add(s1);
            }
            for(int i=1;i<=c;i++)
            {
                Collections.sort(until[i]);
                System.out.print(i+": ");
                for(int j=0 ; j<until[i].size();j++)
                {
                    System.out.print(until[i].get(j)+" ");
                }
                System.out.println();
            }
            
           
        }
    }
}