/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author VANKHANH-PC
 */
public class Cau323_Duongdi_DFS_VoHuong {
    static List<Integer>[] danhsach = (List<Integer>[]) new List[1005];
    static int[] kiemtra = new int[1005];
    static int[] before = new int[1005];
    static int start, end;
    /**
     * @param args the command line arguments
     */       
//Duong di theo DFS tren do thi vo huong
    static int[] duongdiDFS(int start, int end) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        kiemtra[start] = 0;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int i = 0; i < danhsach[u].size(); i++) {
                int v = danhsach[u].get(i);
                if (kiemtra[v] == 1) {
                    kiemtra[v] = 0;
                    stack.push(u);
                    stack.push(v);
                    before[v] = u;
                    break;
                }
            }
        }
        return before;
    }

    static void solve(int start, int end) {
        duongdiDFS(start, end);
        if (before[end] == 0) System.out.println("-1");
        else {
            Stack<Integer> stack = new Stack<>();
            stack.push(end);
            int u = before[end];
            while (u != start) {
                stack.push(u);
                u = before[u];
            }
            stack.push(start);
            while(!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            for (int i = 0; i < danhsach.length; i++) 
            {
                danhsach[i] = new ArrayList<>();
            }
            int a = sc.nextInt();
            int n = sc.nextInt();
            start = sc.nextInt();
            end = sc.nextInt();
            for (int i = 0; i < n; i++) 
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                danhsach[u].add(v);
                danhsach[v].add(u);
            }
            for (int i = 0; i < kiemtra.length; i++) 
            {
                kiemtra[i] = 1;
            }
            solve(start, end);
            System.out.println();
        }
    }
}
