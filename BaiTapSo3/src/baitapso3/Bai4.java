/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapso3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Luong Huy Thong
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Nhap gia tri cua n:");
        int n = sc.nextInt();
        Random random = new Random();
        arr = new int[n];
        int count = 0;
        while(count < n){
            arr[count++] = random.nextInt(100);
        }
        int[] brr = new int[n];
        int bSize = 0;
        boolean isExist = false;
        for(int i = 0; i < n; i++){
            isExist = false;
            for(int j = 0; j < bSize; j++){
                if(arr[i] == brr[j]){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                brr[bSize++] = arr[i];
            }
        }
        System.out.println("Truoc khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        // thao tac 1
        Arrays.sort(arr);
        System.out.println("Sau khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        // thao tac 2
        brr = Arrays.copyOfRange(brr, 0, bSize);
        Arrays.sort(brr); // cat bo cac phan tu du thua
        System.out.println("Mang chi chua cac phan tu duy nhat: ");
        System.out.println(Arrays.toString(brr));
        
    }
}
