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

public class Cau13_SapXepCongViec {

    static int n;
    static long mod = 1000000;
    static ArrayList<Long> arr;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            n = in.nextInt();
            arr = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int start = in.nextInt();
                int end = in.nextInt();
                arr.add(1l * end * mod + start);
            }
            Collections.sort(arr);
            long kq = 0, endTime = 0;
            for (long x : arr) {
                long start = x%mod;
                if (start >= endTime) {
                    kq++;
                    endTime = x/mod;
                }
            }
            System.out.println(kq);
        }
    }

}
