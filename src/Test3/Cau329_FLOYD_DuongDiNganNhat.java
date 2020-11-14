/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau329_FLOYD_DuongDiNganNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int sonngyenN = sc.nextInt(), sonM = sc.nextInt();
        int[][] matran = new int[sonngyenN+1][sonngyenN+1];
        for (int i = 0; i < sonM; i++) {
            int u = sc.nextInt(), v = sc.nextInt(), c = sc.nextInt();
            matran[u][v] = c;
            matran[v][u] = c;
        }
        HashMap<Integer, int[]> map = new HashMap<>();
        int q = sc.nextInt();
        while (q-->0) {
            int x= sc.nextInt(), y = sc.nextInt();
            if (map.containsKey(x)) {
                System.out.println(map.get(x)[y]);
            }
            else d(matran, x, y, sonngyenN+1, map);
        }
    }
    private static void d(int[][] graph, int src, int dst, int n, HashMap<Integer, int[]> map) {
        int[] dist = new int[n];
        boolean[] spt = new boolean[n];

        for (int i = 1; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            spt[i] = false;
        }

        dist[src] = 0;

        for (int i = 1; i < n; i++) {
            int u = minDist(dist, spt);
            spt[u] = true;

            for (int j = 1; j < n; j++) {
                if (!spt[j] && graph[u][j] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j])
                dist[j] = dist[u] + graph[u][j];
            }
        }
        map.put(src, dist);
        System.out.println(dist[dst]);
    }

    private static int minDist(int[] dist, boolean[] spt) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 1; v < dist.length; v++)
            if (!spt[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }
}
