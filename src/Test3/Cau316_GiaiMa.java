/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau316_GiaiMa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int sobotest = sc.nextInt();
        sc.nextLine();
        while (sobotest-- > 0) 
        {
            String mn = sc.nextLine();
            if (mn.charAt(0) == '0')
            {
                System.out.println(0);
                continue;
            }
            int n = mn.length();
            int[] GMM = new int[n + 5];
            //
            GMM[0] = 1;
            GMM[1] = 1;
            
            for (int i = 2; i <= n; i++) 
            {
                GMM[i] = 0;
                if (mn.charAt(i - 1) > '0') 
                {
                    GMM[i] = GMM[i - 1];
                }
                if (
                mn.charAt(i - 2) == '1' || mn.charAt(i - 2) == '2' && mn.charAt(i - 1) < '7') {
                GMM[i]+=GMM[i-2];
                }
            }
            System.out.println(GMM[n]);
        }
    }

}
