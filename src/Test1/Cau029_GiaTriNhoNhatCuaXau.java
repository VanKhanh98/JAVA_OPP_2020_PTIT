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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cau029_GiaTriNhoNhatCuaXau {

    public static long giaTriNhoNhat(String str, int k) {

        String[] arrStr = str.split("");
        String check = "";
        List<Integer> arrs = new ArrayList<>();
        int dem=1;
        for (int i = 0; i < arrStr.length; i++) {
            if (!check.contains(arrStr[i])) {
                check+=arrStr[i];
                for (int j = i + 1; j < arrStr.length; j++) {
                    if (arrStr[i].equals(arrStr[j])) {
                        dem++;
                    }
                }
                arrs.add(dem);
                dem =1;
            }
        }
        for (int i = 0; i < k; i++) {
            Collections.sort(arrs);
            int a = arrs.get(arrs.size()-1)-1;
            arrs.remove(arrs.size()-1);
            arrs.add(a);
        }
        long kq = 0;

        for (Integer arr : arrs) {
            kq += (long)arr*arr;
        }

        return kq;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        while (test-- > 0) {
            int k = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
            System.out.println(giaTriNhoNhat(str,k));
        }

    }

}
