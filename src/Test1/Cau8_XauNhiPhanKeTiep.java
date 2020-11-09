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

public class Cau8_XauNhiPhanKeTiep {

    public static String nextBitString(String str) {

        if (!str.contains("0")) {
            return str.replaceAll("1","0");
        }
        else {
            String[] arrStr = str.split("");

            int i = arrStr.length - 1;

            while (i > -1 && arrStr[i].equals("1")) {
                arrStr[i] = "0";
                i--;
            }
            if (i > 0) {
                arrStr[i] = "1";
            }

            StringBuilder strKq = new StringBuilder();
            for (String s : arrStr) {
                strKq.append(s);
            }
            return strKq.toString();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        while (n-- > 0) {

            String str = in.nextLine();
            System.out.println(nextBitString(str));

        }

    }

}
