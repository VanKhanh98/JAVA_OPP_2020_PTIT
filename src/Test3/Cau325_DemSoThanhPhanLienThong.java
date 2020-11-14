/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau325_DemSoThanhPhanLienThong {
    
    static int[] check;
    static List<Integer>[] danhsach = (List<Integer>[]) new List[1005];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while (m > 0) {
            for (int i = 0; i < danhsach.length; i++) {
                danhsach[i] = new ArrayList<>();
            }
            int V = scanner.nextInt();
            int E = scanner.nextInt();
            //kiem tra 
            check = new int[V + 5];
            for (int i = 0; i < E; i++) {
                
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                
                danhsach[a].add(b);
                danhsach[b].add(a);
            }
            int G = 0;
            for (int i = 1; i <= V; i++) {
                if (check[i] == 0) {
                    G++;
                    dem(i);
                }
            }
            System.out.println(G);
            
        }
    }

    public static void dem(int V) {
        // kiem tra
        check[V] = 1;
        for (int i = 0; i < danhsach[V].size(); i++)
        {
            int v = danhsach[V].get(i);
            if (check[v] == 0) {
                dem(v);
            }
        }
    }

}
