

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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int x, output;
        for(int i = 1; i <= h; i++){
            for(int j = 0; j <= 2*h; j++){
                x = j - h;
                if(x < 0){
                    x*= -1;
                }
                output = i - x;
                if(output > 0){
                    System.out.printf("%3d", output);
                }else{
                    System.out.printf("   ");
                }
            }
            System.out.println();
            
        }
    }
}
