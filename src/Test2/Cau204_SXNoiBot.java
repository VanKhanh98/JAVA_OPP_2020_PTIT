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

public class Cau204_SXNoiBot {

    public static int n;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int temp;
        boolean haveSwap = false;

        for (int i = 0; i < n; i++) {
            haveSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    haveSwap = true;
                }
            }
            if (!haveSwap) {
                break;
            }
            view(i);
        }

    }

    public static void view(int i) {
        System.out.print("Buoc "+(i+1)+": ");
        for (int k = 0; k < n-1; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.print(arr[n-1]);
        System.out.println();
    }

}
