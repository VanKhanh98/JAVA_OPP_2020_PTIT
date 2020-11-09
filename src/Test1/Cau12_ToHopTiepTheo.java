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

public class Cau12_ToHopTiepTheo {

    public static int tim(int n, int k, int[] arr, boolean OK) {
        if (OK) {
            return k;
        } else {
            int[] _arr = new int[k];

            for (int i = 0; i < k; i++) {
                _arr[i] = arr[i];
            }
            for (int i = k - 1; i >= 0; i--) {
                if (arr[i] != (n - k + i + 1)) {
                    arr[i] += 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        arr[j] = arr[j - 1] + 1;
                    }
                    break;
                }
            }
            int dem = 0;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    if (arr[i] == _arr[j]) {
                        dem++;
                        break;
                    }
                }
            }
            return k-dem;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[k];
            boolean OK = true;

            for (int i = 0; i < k; i++) {
                arr[i] = in.nextInt();
                if (arr[i]!=n-k+i+1) OK = false;
            }

            System.out.println(tim(n,k,arr,OK));

        }
    }

}
