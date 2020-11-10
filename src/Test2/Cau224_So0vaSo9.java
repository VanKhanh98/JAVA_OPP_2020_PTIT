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

public class Cau224_So0vaSo9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            int n = in.nextInt();
            ArrayList<Long> lists = new ArrayList<>();
            lists.add(Long.parseLong("9"));
            while (true) {
                Long res = lists.get(0);lists.remove(0);
                if (res % n==0) {
                    System.out.println(res);
                    break;
                }
                lists.add(Long.parseLong(res + "0"));
                lists.add(Long.parseLong(res + "9"));
            }
        }

    }

}
