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
import java.util.ArrayList;
import java.util.Scanner;

public class Cau223_SoBDN2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            TimBDN(n);
        }
    }

    public static void TimBDN(int n) {

        ArrayList<Long> lists = new ArrayList<>();
        lists.add(Long.parseLong("10"));
        lists.add(Long.parseLong("11"));
        while (true) {
            Long res = lists.get(0);
            lists.remove(0);
            if (res % n == 0) {
                System.out.println(res);
                break;
            }
            lists.add(Long.parseLong(res + "0"));
            lists.add(Long.parseLong(res + "1"));
        }

    }

}
