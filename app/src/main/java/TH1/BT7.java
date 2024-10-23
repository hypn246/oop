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
public class BT7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ho, tenLot,ten;
        System.out.println("Nhap ho: ");
        ho=sc.nextLine();
        System.out.println("Nhap ten lot: ");
        tenLot=sc.nextLine();
        System.out.println("Nhap ten: ");
        ten=sc.nextLine();
        String hovaten=ho+" "+tenLot+" "+ten;
        System.out.println(hovaten);
        ///
        int dem=0;
        for(int i=0;i<hovaten.length();i++){
            if(Character.isUpperCase(hovaten.charAt(i)))
                dem++;
        }
        System.out.printf("Ten cua ban co %d ki tu in hoa\n", dem);
        ///
        StringBuilder builder=new StringBuilder();
        builder.append(ten.toLowerCase());
        builder.append(".");
        builder.append(ho.toLowerCase().charAt(0));
        String[] words=tenLot.split(" ");
        for (String w: words){
            builder.append(w.toLowerCase().charAt(0));
        }
        builder.append("@ou.edu.vn");
        System.out.println(builder);
        ///
        String email=builder.toString();
        email=email.replaceAll("@ou.edu.vn", "@gmail.com");
        System.out.println(email);
    }
}
