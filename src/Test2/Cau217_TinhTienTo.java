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

public class Cau217_TinhTienTo {

    public static String str;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            str = in.nextLine();
            Try();
        }

    }

    public static void Try() {
        Stack<Integer> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int a,b;
            switch (c) {
                case '+':
                    a=stack.pop();
                    b=stack.pop();
                    stack.add(a + b);
                    break;
                case '-':
                    a=stack.pop();
                    b=stack.pop();
                    stack.add(a - b);
                    break;
                case '*':
                    a=stack.pop();
                    b=stack.pop();
                    stack.add(a * b);
                    break;
                case '/':
                    a=stack.pop();
                    b=stack.pop();
                    stack.add(a / b);
                    break;
                default:
                    stack.add(c - '0');
            }
        }
        System.out.println(stack.pop());
    }

}
