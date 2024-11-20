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
public class BT14 {
    static Scanner sc=new Scanner(System.in);
    public static void nhap(int[][] arr, int n, int m) {
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("Nhap phan tu arr[%d][%d]",i,j);
                arr[i][j]=sc.nextInt();
                sc.nextLine();
            }
        }
    }
    public static void xuat(int[][] arr, int n, int m) {
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void dong(int[][] arr, int n, int m) {
        for(int i=0; i<m;i++){
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
                if(arr[i][j]>max)
                    max=arr[i][j];
            }
            System.out.printf("Tong dong %d la %d (MAX=%d)\n", (i+1), sum, max);
        }
    }
    public static void cot(int[][] arr, int n, int m) {
        for(int i=0; i<n;i++){
            int min=Integer.MAX_VALUE;
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[j][i];
                if(arr[j][i]<min)
                    min=arr[j][i];
            }
            System.out.printf("Tong dong %d la %d (MIN=%d)\n", (i+1), sum, min);
        }
    }
    public static void main(String[] args) {
        int[][] arr=new int[100][100];
        nhap(arr,3,4);
        xuat(arr,3,4);
        dong(arr,3,4);
    }
}
