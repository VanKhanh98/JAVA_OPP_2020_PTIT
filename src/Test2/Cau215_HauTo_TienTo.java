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
import java.util.Stack;

public class Cau215_HauTo_TienTo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        String chuoi = "+-/*^%";
        in.nextLine();
        while (test-- > 0) {
            String str = in.nextLine();
            String[] arrStr = str.split("");
            Stack<String> stack = new Stack<>();
            for (String s : arrStr) {
                if (chuoi.contains(s)) {
                    String a = stack.pop();
                    String b = stack.pop();
                    stack.add(s + b + a);
                } else stack.add(s);
            }
            System.out.println(stack.pop());
        }
    }

}
