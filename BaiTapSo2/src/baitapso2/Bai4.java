/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapso2;

/**
 *
 * @author Luong Huy Thong
 */
public class Bai4 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            for(int j = 0; j <= 10; j++){
                System.out.printf("%2d x %2d = %3d \n" , i, j, (i*j));
            }
            System.out.println("_______________");
        }
    }
}
