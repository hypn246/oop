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
public class BT4 {
    public static boolean prime(int n) {
        if(n<2)
            return false;
        else if(n==2)
            return true;
        else if(n%2==0)
            return false;
        else
            for(int i=3; i<=Math.sqrt(n);i++){
                if(i%n==0)
                    return false;
            }
        return true;
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap so:");
        n=sc.nextInt();
        if(prime(n))
            System.out.printf("%d la so nguyen to\n", n);
        else
            System.out.printf("%d khong la so nguyen to\n", n);
    }
}
