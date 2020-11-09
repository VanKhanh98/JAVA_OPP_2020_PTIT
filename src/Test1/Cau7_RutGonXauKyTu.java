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

public class Cau7_RutGonXauKyTu {

    public static String rutGonXau(String str) {

        for (int i = 0; i < str.length()-1; i++) {
            if (str.codePointAt(i) == str.codePointAt(i + 1)) {
                return rutGonXau(str.replace(str.substring(i,i+2),""));
            }
        }

        return str;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        if (!rutGonXau(str).isEmpty()) {
            System.out.println(rutGonXau(str));
        }
        else {
            System.out.println("Empty String");
        }

    }

}
