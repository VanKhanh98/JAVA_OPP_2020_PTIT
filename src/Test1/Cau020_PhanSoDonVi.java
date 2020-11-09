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

public class Cau020_PhanSoDonVi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            long P = in.nextLong();
            long Q = in.nextLong();

            while (true) {
                if (Q % P == 0) {
                    System.out.println("1/" + (Q / P));
                    break;
                } else {
                    long a = (Q / P) + 1;
                    System.out.print("1/"+a+" + ");
                    P = P * a - Q;
                    Q = Q * a;
                }
            }
        }

    }

}
