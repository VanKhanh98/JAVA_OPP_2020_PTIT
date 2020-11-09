/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

/**
 *
 * @author VANKHANH-PC
 */
import java.util.*;

public class Cau15_MeCung1 {

    static int n;
    static int[][] arr = new int[20][20];
    static boolean has_road;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            if (arr[1][1]==0) {
                System.out.println(-1);
                continue;
            }
            has_road = false;
            timDuong(1, 1, new StringBuffer(""));
            if (!has_road) {
                System.out.println(-1);
            } else {
                System.out.println();
            }
        }

    }

    public static void timDuong(int r, int c, StringBuffer strB) {
        if (r == n && c == n) {
            System.out.print(strB + " ");
            has_road = true;
            return;
        }
        if (r < n && arr[r + 1][c] == 1) {
            timDuong(r + 1, c, strB.append('D'));
            strB.deleteCharAt(strB.length() - 1);
        }
        if (c < n && arr[r][c + 1] == 1) {
            timDuong(r, c + 1, strB.append('R'));
            strB.deleteCharAt(strB.length() - 1);
        }
    }

}
