/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;
import java.util.Scanner;
/**
 *
 * @author VANKHANH-PC
 */
public class Cau1_Fibonacy {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//Khai báo đối tượng Scanner, giúp chúng ta nhận thông tin từ keyboard
        int n = sc.nextInt(); // sc.nextInt() là cách để lấy giá trị từ //bàn phím, nó sẽ chờ tới khi chúng ta nhập một số.
        int[] arr = new int[93];// khởi tạo mảng arr
        arr[1]= 1;
        arr[2] = 1;
        
        for (int i = 3; i <= 92 ; i++) {
            arr[i] = arr[i-1] + arr[i-2];  
        }
        while (n-- > 0){
        int kq  = sc.nextInt();
            System.out.println(arr[kq]);
        }
            
        
    }
    
}