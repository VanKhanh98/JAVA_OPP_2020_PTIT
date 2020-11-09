/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import java.util.Scanner;

/**
 *
 * @author VANKHANH-PC
 */
public class Cau202_Sx_chon {

    public static int  n ; // biến static
    public static int[] array;// mảng static

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // nhập vào n chờ đến khi nhập 1 số
        array = new int[n]; // cấp phát kích thuwosc cho mảng
//nhập vào phần tử mảng
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int min_idx; // phần tủ nhỏ
        int temp; //
// tìm phần tuer nhỏ nhất của mảng chưa sắp xếp
        for (int i = 0; i < n - 1; i++) {
            min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[min_idx] > array[j]) {
                    min_idx = j;
                }
            }
            //Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên
            temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
            view(i);
        }
    }

    public static void view(int i) {
        System.out.print("Buoc " + (i + 1) + ": ");
        for (int k = 0; k < n - 1; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.print(array[n - 1]);
        System.out.println();
    }

}
