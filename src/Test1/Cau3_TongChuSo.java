/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;


import java.util.Arrays;
import java.util.Scanner;

public class Cau3_TongChuSo {


    public static String sapXepStr(String str) {
        StringBuilder kq = new StringBuilder();
        String[] arrStr = str.split("");
        String strSo = "0123456789";

        Arrays.sort(arrStr);
        long tong = 0;
        for (String s : arrStr) {
            if (strSo.contains(s)) {
                tong += Integer.parseInt(s);
            } else {
                kq.append(s);
            }
        }

        return kq.toString() + tong;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        while (n-- > 0) {
            String str = in.nextLine();
            System.out.println(sapXepStr(str));
        }

    }

}
