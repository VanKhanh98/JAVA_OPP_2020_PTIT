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

public class Cau14_NoiDay {

    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-- >0){
            int n = input.nextInt();
            PriorityQueue<Long> arr = new PriorityQueue<>();
            for (int i = 1; i <= n; i++) {
                int x = input.nextInt();
                arr.add((long)x);
            }

            long kq = 0;

            while (arr.size() > 1) {
                long a = arr.poll();
                long b = arr.poll();
                kq = (kq+(a+b)%mod)%mod;
                arr.add((a+b)%mod);
            }

            System.out.println(kq);
        }
    }

}
