/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BT2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r;
        System.out.println("Nhap ban kinh: ");
        r=sc.nextFloat();
        System.out.printf("Chu vi hinh tron la: %08.3f \n", (double)Math.PI*2*r);
        System.out.printf("Dien tich hinh tron la: %f \n", (double)Math.PI*Math.pow(r, 2));
    }
}
