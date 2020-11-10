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

public class Cau226_BienDoiS_T {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        while (test-- > 0) {
            int s = in.nextInt();
            int t = in.nextInt();

            if (s >= t) {
                System.out.println(s-t);
            }
            else {
                System.out.println(Try(s,t));
            }
        }

    }

    public static int Try(int s, int t) {
        if (s >= t) {
            return s-t;
        }
        int dem =0;
        if (t % 2 == 1) {
            dem = 1;
            t++;
        }
        return (dem + 1 + Try(s, t / 2));
    }

}
