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
public class BT8 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int r,n,ch;
        r=(int)(Math.random() *100)+1;
        do {            
            do{
                System.out.println("Nhap so ban doan:");
                n=sc.nextInt();
                if(n>r)
                    System.out.println("So ban doan lon hon");
                else if(n<r)
                    System.out.println("So ban doan nho hon");
                else
                    System.out.println("Ban doan dung r");
            }while(n!=r);
            System.out.println("CHoi tiep ko\n 1=co 0=khong");
            ch=sc.nextInt();
        } while (ch!=0);
    }
}
