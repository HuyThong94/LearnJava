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
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int x;
        while(n > 0){
            x = n % 10;
            n /=10;
            sum += x;
        }
        System.out.println("SUm = " + sum);
    }
}
