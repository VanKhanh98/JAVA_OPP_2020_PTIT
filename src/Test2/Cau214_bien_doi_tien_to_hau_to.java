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


public class Cau214_bien_doi_tien_to_hau_to {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test>0){
            String str = input.nextLine();
            String arr[]=str.split("");
            ArrayList<String> lists = new ArrayList<String>();
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i].equals("+")
                    ||arr[i].equals("-")
                    ||arr[i].equals("*")
                    ||arr[i].equals("/")
                    ||arr[i].equals("+")
                    ||arr[i].equals("^")
                    ||arr[i].equals("%")){
                    String a= lists.get(lists.size()-1);lists.remove(lists.size()-1);
                    String b= lists.get(lists.size()-1);lists.remove(lists.size()-1);
                    lists.add(a+b+arr[i]);
                }
                else{
                    lists.add(arr[i]);
                }
            }
            System.out.println(lists.get(0));
            
            test--;
        }
    }
}
