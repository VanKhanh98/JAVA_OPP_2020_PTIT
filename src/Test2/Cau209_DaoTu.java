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
import java.util.Scanner;

public class Cau209_DaoTu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            String str = in.nextLine();
            Try(str);
        }

    }

    public static void Try(String str) {

        String[] arrStr = str.split(" ");
        int length = arrStr.length;

        for (int i = 0; i < length - 1; i++) {
            System.out.print((new StringBuffer(arrStr[i])).reverse().toString()+" ");
        }
        System.out.println((new StringBuffer(arrStr[length-1])).reverse().toString());
    }

}
