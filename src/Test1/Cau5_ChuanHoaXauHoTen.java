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

public class Cau5_ChuanHoaXauHoTen {

    public static String chuanHoa(String str) {

        str = str.trim();

        while (str.contains("  ")) {
            str = str.replace("  "," ");
        }
        String[] arrStr = str.split(" ");

        StringBuilder kq = new StringBuilder();
        for (String s : arrStr) {
            kq.append(s.substring(0, 1).toUpperCase());
            kq.append(s.substring(1).toLowerCase());
            kq.append(" ");
        }

        return kq.toString().trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        while (n-- > 0) {
            String str = in.nextLine();
            System.out.println(chuanHoa(str));
        }
    }

}
