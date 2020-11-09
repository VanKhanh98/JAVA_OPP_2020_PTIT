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

public class Cau025_HoanViXauKyTu {

    static int n;
    static String str;
    static int[] arr;
    static boolean[] isCheck;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            str = in.next();
            n = str.length();
            isCheck = new boolean[n];
            arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                isCheck[i] = true;
            }
            Try(0);
            System.out.println();
        }

    }

    public static void Try(int i) {

        for (int j = 0; j < n; j++) {
            if (isCheck[j]) {
                arr[i] = j;
                isCheck[j] = false;
                if (i == n - 1) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(str.charAt(arr[k]));
                    }
                    System.out.print(" ");
                } else Try(i + 1);
                isCheck[j] = true;
            }
        }

    }

}
