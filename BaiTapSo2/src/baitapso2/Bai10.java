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
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        if(n == 1){
            System.out.println(n + " = " +n);
        }else{
            System.out.print(n + " = ");
            while(n != 1){
                if(n %i == 0){
                System.out.print(i + " x ");
                n /= i;
                }else{
                    ++i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
