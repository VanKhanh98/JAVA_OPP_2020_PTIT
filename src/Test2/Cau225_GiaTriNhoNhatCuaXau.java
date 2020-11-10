/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

/**
 *
 * @author VANKHANH-PC
 */
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Cau225_GiaTriNhoNhatCuaXau {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int k = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
            int[] arr = new int[26];
            for (int i = 0; i < str.length(); i++) {
                int j = (int)(str.charAt(i)-'A');
                arr[j]++;
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < 26; i++) {
                if (arr[i] > 0) {
                    queue.add(arr[i]);
                }
            }
            while (k-- > 0 && queue.size() > 0) {
                int temp = queue.poll();
                System.out.println(temp);
                queue.add(temp--);
                if (temp-- > 0) {
                    queue.add(temp);
                }
            }
            long kq =0;
            while (queue.size() > 0) {
                long tmp = (long) queue.poll();
                kq += tmp*tmp;
            }
            System.out.println(kq);
        }
    }

}

