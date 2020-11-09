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
import java.util.List;
import java.util.Scanner;

public class Cau6_DiaChiEmail {

    public static String taoEmail(String str) {
        str = str.trim();

        while (str.contains("  ")) {
            str = str.replace("  "," ");
        }
        String[] arrStr = str.split(" ");

        StringBuilder kq = new StringBuilder();

        kq.append(arrStr[arrStr.length-1].toLowerCase());

        for (int i = 0; i < arrStr.length - 1; i++) {
            kq.append(arrStr[i].substring(0,1).toLowerCase());
        }

        return kq.toString();
    }

    public static String demEmail(String str, List<String> arrStr) {

        int count = 0;

        for (String s : arrStr) {
            if (str.equals(s)) {
                count++;
            }
        }

        if (count > 1) {
            return count+"";
        }
        return "";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        List<String> arrStr = new ArrayList<>();

        while (n-- > 0) {
            String str = in.nextLine();
            String kq = taoEmail(str);
            arrStr.add(kq);
            System.out.println(kq+demEmail(kq,arrStr)+"@ptit.edu.vn");
        }

    }

}
