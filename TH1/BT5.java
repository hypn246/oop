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
public class BT5 {
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
    public static int sum(int[] arr, int n){
        int s=0;
        for(int i=0; i<n;i++){
            //su dung ham cua class chung package
            if(BT4.prime(arr[i]))
                s+=arr[i];
        }
        return s;
    }
    public static void xuat(int[] arr, int n){
        for(int i=0; i<n;i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println("");
    }
    public static void check(int[] arr, int n){
        Scanner sc=new Scanner(System.in);
        int f;
        System.out.println("Nhap so:");
        f=sc.nextInt();
        for(int k=0;k<n;k++){
            if(arr[k]==f){
                System.out.printf("So can tim o vi tri: arr[%d]\n", k);
                return;
            }
            
        }
        System.out.println("Khong tim thay");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap so:");
        n=sc.nextInt();
        int[] arr =new int[100];
        for(int i=0;i<n;i++){
            System.out.printf("Nhap phan tu thu %d: ",i+1);
            arr[i]=sc.nextInt();
        }
        //a  xuat mang, arr la tham chieu, n tham tri
        xuat(arr, n);
        //b tong snt
        int s=sum(arr, n);
        System.out.printf("Tong so nguyen trong mang la: %d\n",s);
        //c tim kiem
        check(arr, n);
    }
}
