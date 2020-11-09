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

public class Cau027_NhamChuSo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        System.out.println(tim(A,B));

    }

    public static String tim(String A, String B) {
        String minA = A.replaceAll("6","5");
        String maxA = A.replaceAll("5","6");
        String minB = B.replaceAll("6","5");
        String maxB = B.replaceAll("5", "6");

        long min = Long.parseLong(minA) + Long.parseLong(minB);
        long max = Long.parseLong(maxA) + Long.parseLong(maxB);

        return min+" "+max;
    }

}
