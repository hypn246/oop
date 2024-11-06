/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BT10 { 
    public static void main(String[] args) {
        String path="D:/numbers.txt";
        File f=new File(path);
        int sum=0;
        int max=Integer.MIN_VALUE;
        int num;
        double avg;
        try{
            Scanner sc=new Scanner(f);
            String line=sc.nextLine();
            String[] data=line.split(" ");
            for (String n: data){
                num=Integer.parseInt(n);
                sum+=num;
                if(num>max)
                    max=num;
            }
            avg=(double)sum/data.length;
            System.out.printf("Tong danh sach la: %d\n", sum);
            System.out.printf("Trung binh day so la: %.2f\n", avg);
        }catch(FileNotFoundException e){
            System.out.println("Ko tim thay file");
        }
    }
}
