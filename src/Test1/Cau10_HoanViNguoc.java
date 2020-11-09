/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

/**
 *
 * @author VANKHANH-PC
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau10_HoanViNguoc {

    public void permute(int[] nums) {
        List<String> result = new ArrayList<>();
        String str = "";
        for (int num : nums) {
            str+=num;
        }
        result.add(str);
        permutation(0,nums.length, nums, result);

        for (int i = result.size() - 1; i >= 1; i--) {
            System.out.print(result.get(i)+" ");
        }
        System.out.print(result.get(0));
    }

    public void permutation(int start,int n,int[] nums, List<String> result) {
        int j = n-2;
        while (j > -1 && nums[j] > nums[j + 1]) {
            j--;
        }
        if (j > -1) {
            int k = n-1;
            while (nums[j] > nums[k]) {
                k--;
            }
            swap(nums,j,k);
            int r = j + 1, s = n - 1;
            while (r < s) {
                swap(nums,r,s);
                r++;
                s--;
            }
            String str = "";
            for (int num : nums) {
                str+=num;
            }
            result.add(str);
            permutation(start+1,n,nums,result);
        }
        else {
            return;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int test = in.nextInt();

        HoanViNguoc hv = new HoanViNguoc();

        while (test-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i]=i+1;
            }
            hv.permute(arr);
            System.out.println();
        }

    }

    private static class HoanViNguoc {

        public HoanViNguoc() {
        }

        private void permute(int[] arr) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
