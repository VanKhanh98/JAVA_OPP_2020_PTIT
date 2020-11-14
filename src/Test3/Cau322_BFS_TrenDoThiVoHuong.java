/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau322_BFS_TrenDoThiVoHuong {

    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check;
    static Queue<Integer> queue = new LinkedList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }

            int v = in.nextInt();
            int e = in.nextInt();
            int u = in.nextInt();
            check = new int[v + 5];
            for (int i = 0; i < e; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            Arrays.fill(check, 1);
            BFS(u);
            System.out.println();

        }
    }

    public static void BFS(int u) {
        queue.add(u);
        check[u] = 0;
        System.out.print(u + " ");
        while (!queue.isEmpty()) {
            int s = queue.poll();
            for (int i = 0; i < list[s].size(); i++) {
                int t = list[s].get(i);
                if (check[t] == 1) {
                    System.out.print(t + " ");
                    queue.add(t);
                    check[t] = 0;
                }
            }
        }
    }

}
