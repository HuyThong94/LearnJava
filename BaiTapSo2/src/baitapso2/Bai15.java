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
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double pi = 0;
        long n = 0;
        double x = 1.0 / (n * 2 + 1);
        while(c <= x){
            pi += Math.pow(-1, n)*x;
            n++;
            x = 1.0 / (2 * n + 1);
        }
        pi *= 4;
        System.out.println("PI = " + pi);
    }
}
