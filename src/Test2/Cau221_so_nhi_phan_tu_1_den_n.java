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

public class Cau221_so_nhi_phan_tu_1_den_n {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int test = input.nextInt();
        while(test>0){
            int n = input.nextInt();
            for(int i=1;i<=n;i++){
                System.out.print(binary(i)+" ");
            }
            System.out.println();
            test--;
        }
    }
    static String binary(int n){
        int k = new Integer(n);
        String kq = Integer.toBinaryString(k).toString();
        return kq;
    }
}
