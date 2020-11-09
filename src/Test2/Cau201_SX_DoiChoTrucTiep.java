package Test2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author VANKHANH-PC
 */
public class Cau201_SX_DoiChoTrucTiep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//(kích thuwosc mảng ) phần tử nhập vào chờ đên khi nhập 1 số

        int[] arr = new int[n]; // khai báo và cấp phát bộ nhớ co mảng
        //nhạp vào phần tử của mảng
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    // duyệt i từ 0 đến n - 2
    // sau mỗi lần duyệt j = n - 1 đến j >= 1
    // thì sẽ tìm được phần tử nhỏ nhất
    // sau đó tăng i lên 1 và quay lại duyệt j
    // khi i > n - 1 thì ngừng vòng lặp
    
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
            // nếu phần tử đứng sau nhỏ hơn phần tử đứng trước
            // thì đổi chỗ 2 phần tử đó cho nhau
            // với cách sắp xếp này thì trong lần duyệt đầu tiên
            // phần tử nhỏ nhất sẽ được chuyển lên trên cùng.
                if (arr[i] > arr[j]) {
                int temp   = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n - 1; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.print(arr[n - 1]);
            System.out.println();
        }

    }

}
