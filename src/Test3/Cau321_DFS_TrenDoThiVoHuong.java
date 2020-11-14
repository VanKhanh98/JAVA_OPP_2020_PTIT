/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau321_DFS_TrenDoThiVoHuong {
    static List<Integer>[] danhsach;
    static int[] kiemtra;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int sltest = sc.nextInt();
        while (sltest-- > 0) {
            danhsach = (List<Integer>[]) new List[1005];
            for (int i = 0; i < danhsach.length; i++)
            {
                danhsach[i] = new ArrayList<>();
            }
            int v = sc.nextInt();
            int e = sc.nextInt();
            int u = sc.nextInt();
            //
            kiemtra = new int[v + 5];
            for (int i = 0; i < e; i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                danhsach[a].add(b);
                danhsach[b].add(a);
            }
            Arrays.fill(kiemtra, 1);
            DFS(u);
            System.out.println();
        }
    }
    public static void DFS(int u) 
    {
        kiemtra[u] = 0;
        System.out.print(u + " ");
        for (int i = 0; i < danhsach[u].size(); i++) 
        {
            int v = danhsach[u].get(i);
            if(kiemtra[v]==1) DFS(v);
        }
    }

}
