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
import java.util.Scanner;

public class Cau19_SoKhoiLapPhuong {

    static long kq;
    static String str;
    static int n;
    static StringBuffer strB;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            str = in.nextLine();
            kq = -1;
            n = str.length();
            strB = new StringBuffer("");
            Try(1);
            System.out.println(kq);
        }
    }

    public static void Try(int i) {
        if (i > n) {
            if (strB.length() > 0) {
                long strBLong = Long.parseLong(new String(strB));
                long strBPow = Math.round(Math.pow((double) strBLong, 1.0 / 3.0));
                if (Math.pow(strBPow, 3.0) == strBLong) {
                    kq = Math.max(kq, strBLong);
                }
            }
            return;
        }
        Try(i + 1);
        strB.append(str.charAt(i - 1));
        Try(i + 1);
        strB.deleteCharAt(strB.length() - 1);
    }

}
