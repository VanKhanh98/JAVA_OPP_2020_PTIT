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

public class Cau220_BieuThucTangGiam {

    static String str;
    static int[] arr = new int[12];
    static int[] arr1 = new int[12];
    static int[] kq = new int[12];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            str = in.nextLine();
            n = str.length() + 1;
            for (int i = 0; i < 12; i++) {
                arr[i] = arr1[i] = kq[i] = 0;
            }

            Try(1);

            for (int i = 1; i <= n; i++) {
                System.out.print(kq[i]);
            }
            System.out.println();
        }
    }

    public static void Try(int k) {
        for (int i = 1; i < 10; i++) {
            if (arr[i] == 0) {
                arr1[k]=i;
                arr[i]=1;
                if (k == n) {
                    int check = 0;
                    for (int j = 1; j <= n; j++) {
                        if (arr1[j] < kq[j]) {
                            check =1;
                            break;
                        } else if (arr1[j] > kq[j]) {
                            break;
                        }
                    }
                    int check1 = 1;
                    for (int j = 2; j <= n; j++) {
                        if (str.charAt(j - 2) == 'I') {
                            if (arr1[j] < arr1[j - 1]) {
                                check1 = 0;
                            }
                        }else {
                            if (arr1[j] > arr1[j - 1]) {
                                check1 = 0;
                            }
                        }
                    }
                    if (check == 1 || kq[1] == 0 && check1 == 1) {
                        for (int j = 1; j <= n; j++) {
                            kq[j] = arr1[j];
                        }
                    }
                }
                else {
                    Try(k+1);
                }
                arr[i] = 0;
            }
        }
    }

}
