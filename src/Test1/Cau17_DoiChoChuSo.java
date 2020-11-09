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
import java.util.*;

public class Cau17_DoiChoChuSo {

    static int n;
    static int k;
    static long kq;
    static Set<Long> set;
    static StringBuffer str;

    public static void DoiCho() {
        Queue<StringBuffer> queue = new LinkedList<>();
        queue.add(str);
        for (int i = 1; i <= k; i++) {
            int queueL = queue.size();
            for (int j = 1; j <= queueL; j++) {
                StringBuffer tmp = queue.poll();
                for (int v = 0; v < n; v++) {
                    for (int u = 0; u < n; u++) {
                        if(v==0 && str.charAt(u)=='0') continue;
                        char c = tmp.charAt(v);
                        tmp.setCharAt(v, tmp.charAt(u));
                        tmp.setCharAt(u,c);
                        long value = Long.parseLong(new String(tmp));
                        if (!set.contains(value)) {
                            kq = Math.max(kq, value);
                            set.add(value);
                            queue.add(new StringBuffer(tmp));
                        }
                        c = tmp.charAt(v);
                        tmp.setCharAt(v, tmp.charAt(u));
                        tmp.setCharAt(u, c);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        in.nextLine();
        while (test-- > 0) {
            k = in.nextInt();
            in.nextLine();
            str = new StringBuffer(in.nextLine());
            n = str.length();
            kq = Long.parseLong(new String(str));
            set = new HashSet<>();
            set.add(kq);
            DoiCho();
            System.out.println(kq);
        }

    }

}
