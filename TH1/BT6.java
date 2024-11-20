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
public class BT6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x,f=0;
        System.out.println("Nhap bac da thuc:");
        n=sc.nextInt();
        int[] arr =new int[100];
        for(int i=0;i<=n;i++){
            System.out.printf("Nhap he so thu %d: ",i+1);
            arr[i]=sc.nextInt();
        }
        System.out.println("Nhap gia tri x can thay vao:");
        x=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+"x^"+(n-i)+"+");
            f+=arr[i]*Math.pow(x, (n-i));
        }
        System.out.println("\nGia tri f(x) la:");
    }
}
