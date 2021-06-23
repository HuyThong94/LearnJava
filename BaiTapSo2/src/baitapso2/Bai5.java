/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapso2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        Random rd = new Random();
        while(true){
            int randomNumber = rd.nextInt(100);
            count++;
            System.out.println("Random number: " + randomNumber + ", input: " + input);
            if(randomNumber == input){
                System.out.println("Thuc Hien: " + count + "lan.");
                break;
            }
        }
    }
}
