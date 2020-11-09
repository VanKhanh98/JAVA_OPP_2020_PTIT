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
import java.util.Scanner;

public class Cau030_BieuThucDung {

    public static int tim(String str) {

        int kq =0;
        int xoa =0;
        String arr[]= str.split("");
        ArrayList<String> lists = new ArrayList<>();
        for (String s : arr) {
            if (lists.size() == 0) lists.add(s);
            else if (lists.get(lists.size() - 1).equals("[") && s.equals("]")) {
                lists.remove(lists.size() - 1);
                xoa += 2;
            } else if (lists.get(lists.size() - 1).equals("]") && s.equals("[")) {
                kq += lists.size() + xoa;
                lists.remove(lists.size() - 1);
            } else if (s.equals("[")) {
                lists.add(s);
            } else if (lists.get(lists.size() - 1).equals("]") && s.equals("]")) {
                lists.add(s);
            }
            if (lists.size() == 0) xoa = 0;
        }

        return kq;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        in.nextLine();

        while (test-- > 0) {
            String str = in.nextLine();
            System.out.println(tim(str));
        }

    }

}
