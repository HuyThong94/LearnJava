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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        int i;
        if (n % 2 == 0){ 
            i = 2;
        }else{
            i = 1;
        }
        long sum = 0;
        for(;i <= n; i +=2){
            sum +=i;
        }
        System.out.println("Result: " + sum);
    }
}
