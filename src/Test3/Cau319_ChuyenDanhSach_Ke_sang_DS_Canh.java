/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author VANKHANH-PC
 */
public class Cau319_ChuyenDanhSach_Ke_sang_DS_Canh {
    static List<Integer>[] danhsach =  new List[1005]; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        //
        int n = Integer.parseInt(str);
        for (int i = 0; i < danhsach.length; i++) 
        {
            danhsach[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= n; i++) 
        {
            String s = input.nextLine();
            String[] arr = s.split("\\s");
            for (int j = 0; j < arr.length; j++) 
            {
                danhsach[i].add(Integer.parseInt(arr[j]));
            }
        }
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 0; j < danhsach[i].size(); j++) 
            {
                if(danhsach[i].get(j) > i)
                {
                    System.out.print(i + " ");
                    System.out.println(danhsach[i].get(j));
                }
            }
        }
    }
}
