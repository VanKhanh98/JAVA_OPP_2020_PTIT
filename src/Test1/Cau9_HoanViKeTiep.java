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
import java.util.Arrays;
import java.util.Scanner;

public class Cau9_HoanViKeTiep {

    public static String sinhHoanVi(String str, int n) {

        String[] arrStr = str.split(" ");

        int j = n - 2;
        while (j > -1 && Integer.parseInt(arrStr[j]) > Integer.parseInt(arrStr[j + 1])) {
            j--;
        }
        if (j > -1) {
            int k = n-1;
            while (Integer.parseInt(arrStr[j]) > Integer.parseInt(arrStr[k])) {
                k--;
            }
            String tg = arrStr[j];
            arrStr[j] = arrStr[k];
            arrStr[k] = tg;
            int r = j + 1, s = n-1;
            while (r < s) {
                tg = arrStr[r];
                arrStr[r] = arrStr[s];
                arrStr[s] = tg;
                r++;
                s--;
            }

        }
        else {
            Arrays.sort(arrStr);
        }

        StringBuilder strKq = new StringBuilder();
        for (String s : arrStr) {
            strKq.append(s);
            strKq.append(" ");
        }
        return strKq.toString().trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
            System.out.println(sinhHoanVi(str,n));
        }
    }

}
