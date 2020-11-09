/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau203_SX_Chen {

    public static int n;
    public static int[] arr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int key;
        int j;

        for (int i = 0; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            view(i);
        }
    }
    public static void view(int i) {
        System.out.print("Buoc "+(i)+": ");
        for (int k = 0; k < i; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.print(arr[i]);
        System.out.println();
    }
}
