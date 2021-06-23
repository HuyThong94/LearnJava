/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapso2;

import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long f0 = 0, f1 = 1, fn = 0;
        for (int i = 0; i <= n; i++) {
            if (n < 2) {
                System.out.println(i);
            } else {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.println(fn);
            }
        }
    }
}
