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
public class Bai14 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhap gia tri cua m:");
        int n = sc.nextInt();
        System.out.println("Nhap gia tri cua n");
        int m = sc.nextInt();
//        }catch(Exception e){
//            if(m >= n){
//                throw new Exception("Gia tri cua m phải be hơn gia tri cua n! vui long nhap lai");
//            }
//            return;
//        }
        if(m < n){
            if ((m >= 0 && n >= 0) || n >= 0) {
            for (int i = 0; i <= n; i++) {
                if (i >= m) {
                    int res = (int) Math.sqrt(i);
                    if (res * res == i) {
                        count++;
                        System.out.printf("%10d", i);
                        if (count % 10 == 0) {
                            System.out.println();
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("Gia tri cua m phải be hơn gia tri cua n! vui long nhap lai");
            return;
        }
        System.out.println("\nSo luong so chinh phuong thoa man:" + count);
    }
}
