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

public class Cao212_BieuThucSoHoc {

    static String str;

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
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }
            else  {
                if (str.charAt(i) == ')') {
                    char x = stack.pop();
                    if (x == '(') {
                        System.out.println("Yes");
                        return;
                    }
                    while (x != '(') {
                        x = stack.pop();
                    }
                } else {
                    if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                        continue;
                    }
                    stack.push(str.charAt(i));
                }
            }
        }
        System.out.println("No");
    }

}
