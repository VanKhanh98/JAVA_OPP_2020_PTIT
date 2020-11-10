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

public class Cau211_DayNgoacDungMax {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();

        while (test-- > 0) {
            String str = in.nextLine();
            Try(str);
        }

    }

    public static void Try(String str) {
        int length = 0;
        int strLength = str.length();
        int[] arr = new int[strLength];
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stackInter = new Stack<>();

        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
                stackInter.push(i);
            }
            else {
                if (!stack.isEmpty()) {
                    char topChar = stack.peek();
                    int topIndex = stackInter.peek();
                    if (topChar == '(') {
                        arr[topIndex]=1;
                        arr[i]=1;
                        stack.pop();
                        stackInter.pop();
                    }
                }
            }
        }

        for (int i = 0; i < strLength; i++) {
            if (arr[i] == 1) {
                for (int j = i; j < strLength; j++) {
                    if (arr[j] == 0 || j == strLength - 1) {
                        if (arr[j] == 0) {
                            length = Math.max(length, j - i);
                        } else length = Math.max(length, j - i + 1);
                        i=j;
                        break;
                    }
                }
            }
        }
        System.out.println(length);
    }

}
