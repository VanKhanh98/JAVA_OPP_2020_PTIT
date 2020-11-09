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
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Cau11_LietKeTapCon {
    static int n;
    static String s;
    static Set<String> arrStr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        in.nextLine();

        while (test-- > 0) {
            n = in.nextInt();
            in.nextLine();
            s = in.nextLine();
            arrStr = new TreeSet<>();
            TapCon(0,new StringBuffer(""));
            Iterator<String> it = arrStr.iterator();
            while(it.hasNext()){
                System.out.print(it.next()+" ");
            }
            System.out.println();
        }
    }

    public static void TapCon(int i, StringBuffer strB) {
        if (i == n) {
            if (strB.length() > 0) {
                arrStr.add(new String(strB));
            }
            return;
        }
        TapCon(i + 1, strB);
        TapCon(i + 1, strB.append(s.charAt(i)));
        strB.deleteCharAt(strB.length() - 1);
    }

}
