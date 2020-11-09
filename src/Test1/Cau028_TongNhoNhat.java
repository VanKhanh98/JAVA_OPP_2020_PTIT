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
import java.util.Arrays;
import java.util.Scanner;

public class Cau028_TongNhoNhat {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            String str1 = "";
            String str2 = "";
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    str1 += arr[i];
                else
                    str2 += arr[i];
            }
            Long sum = Long.parseLong(str1) + Long.parseLong(str2);
            System.out.println(sum);
        }

    }

}
