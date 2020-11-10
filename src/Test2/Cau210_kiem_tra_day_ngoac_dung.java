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


public class Cau210_kiem_tra_day_ngoac_dung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while(test>0){
            String str = input.nextLine();
            String arr[]=str.split("");
            ArrayList<String> lists = new ArrayList<String>();
            boolean is =true;
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals("[")||arr[i].equals("{")||arr[i].equals("(")){
                    lists.add(arr[i]);
                }
                else if((arr[i].equals("]")&&lists.size()==0)||(arr[i].equals("}")&&lists.size()==0)||(arr[i].equals(")")&&lists.size()==0)){
                    System.out.println("NO");
                    is=false;
                    break;
                }
                else {
                    if(lists.get(lists.size()-1).equals("{")&&arr[i].equals("}")
                        ||lists.get(lists.size()-1).equals("[")&&arr[i].equals("]")
                        ||lists.get(lists.size()-1).equals("(")&&arr[i].equals(")")
                        ){
                        lists.remove(lists.size()-1);
                    }else{
                        System.out.println("NO");
                        is=false;
                        break;
                    }
                }
                
            }
            if(is)System.out.println("YES");
            
            test--;
        }
    }
}

