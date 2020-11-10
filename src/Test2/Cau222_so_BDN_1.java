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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Truong-nd
 */
public class Cau222_so_BDN_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test>0){
            String str = input.nextLine();
            String arr[]=str.split("");
            String res ="";
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals("0") || arr[i].equals("1")) res+=arr[i];
                else {
                    for(int j=i;j<arr.length;j++){
                        res+="1";
                    }
                    break;
                }
            }
            int kq = Integer.parseInt(res,2);
            System.out.println(kq);
            test--;
        }
    }
}
