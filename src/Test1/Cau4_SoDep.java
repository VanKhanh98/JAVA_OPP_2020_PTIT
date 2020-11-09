/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;
import java.util.Scanner;

public class Cau4_SoDep {

    public static String checkSoDep(String str) {

        String[] arrStr = str.split("");

        int length = arrStr.length;

        for (int i = 0; i <= (length/2); i++) {
            int j = length - 1 - i;
            if (Integer.parseInt(arrStr[i])%2==1 || Integer.parseInt(arrStr[i])!=Integer.parseInt(arrStr[j])) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        while (n-- > 0) {
            String str = in.nextLine();
            System.out.println(checkSoDep(str));
        }
    }

}
