/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapso3;

import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class Bai1 {

    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean test = true;
        int mid = n / 2;
        int x;
        for (int i = 0; i <= mid; i++) {
            x = n - 1 - i;
            if (arr[i] != arr[x]) {
                test = false;
                break;
            }
        }
        if (test == true) {
            System.out.println("Mang doi xung!");
        } else {
            System.out.println("Mang khong doi xung!");
        }
    }
}
