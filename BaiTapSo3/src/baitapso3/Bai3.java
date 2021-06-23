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
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        int min = Integer.MAX_VALUE;
        int[] arr;
        System.out.println("Nhap gia tri cua x:");
        int x = sc.nextInt();
        System.out.println("Nhap gia tri cua n:");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i], x);
            if (nguyenTo(arr[i]) && currentMin < min) {
                min = currentMin;
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("chi so phan tu: " + index + ", gia tri = " + arr[index]);
        } else {
            System.out.println("Khon ton tai gia tri thoa man");
        }
    }

    public static int getMin(int a, int x) {
        return Math.abs(a - x);
    }

    public static boolean nguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i < a; i++) {
            return false;
        }
        return true;
    }

}
