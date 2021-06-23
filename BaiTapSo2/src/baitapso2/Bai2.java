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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        int a = sc.nextInt();
        System.out.println("Nhap gia tri b: ");
        int b = sc.nextInt();
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if(i == 0 || j == 0 || i == a - 1 || j == b - 1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();     
        }
    }
}
