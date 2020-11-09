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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cau16_MeCung2 {

    static int n;
    static int[][] arr = new int[200][200];
    static boolean has_road;
    static ArrayList<String> kq;

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
            if (arr[1][1] == 0) {
                System.out.println(-1);
                continue;
            }
            else {
                arr[1][1] = 0;
            }

            has_road = false;
            kq = new ArrayList<>();

            timDuong(1, 1, new StringBuffer(""));
            if (!has_road) {
                System.out.println(-1);
            }
            else {
                Collections.sort(kq);
                for (String str : kq) {
                    System.out.print(str + " ");
                }
                System.out.println();
            }

        }
    }

    public static void timDuong(int r, int c, StringBuffer strB) {

        if (r == n && c == n) {
            kq.add(new String(strB));
            has_road = true;
            return;
        }
        if (r < n && arr[r + 1][c] == 1) {
            arr[r + 1][c] = 0;
            timDuong(r+1,c,strB.append('D'));
            strB.deleteCharAt(strB.length() - 1);
            arr[r + 1][c] = 1;
        }
        if (c > 1 && arr[r][c - 1] == 1) {
            arr[r][c - 1] = 0;
            timDuong(r, c - 1, strB.append('L'));
            strB.deleteCharAt(strB.length() - 1);
            arr[r][c - 1] = 1;
        }
        if (c < n && arr[r][c + 1] == 1) {
            arr[r][c + 1] = 0;
            timDuong(r, c + 1, strB.append('R'));
            strB.deleteCharAt(strB.length() - 1);
            arr[r][c + 1] = 1;
        }
        if (r > 1 && arr[r - 1][c] == 1) {
            arr[r - 1][c] = 0;
            timDuong(r - 1, c, strB.append('U'));
            strB.deleteCharAt(strB.length() - 1);
            arr[r - 1][c] = 1;
        }

    }

}
