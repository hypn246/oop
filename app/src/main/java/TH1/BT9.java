/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BT9 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        int op;
        String name;
        do{
            System.out.println("1. Them sv\n2. Nhap sv\n3. Xoa sv\n4. Tim kiem = ten \n0. Exit\nNhap lua chon: ");
            op=sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Nhap ten can them: ");
                    name=sc.nextLine();
                    list.add(name);
                    break;
                case 2:
                    for (String sv : list) {
                        System.out.println(sv);
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten can xoa: ");
                    name=sc.nextLine();
                    if(list.indexOf(name)>=0)
                        list.remove(name);
                    else
                        System.out.println("Khong tim thay sv");
                    break;
                case 4:
                    System.out.println("Nhap ten can tim: ");
                    name=sc.nextLine();
                    int index;
                    index=list.indexOf(name);
                    if(index>=0)
                        System.out.println(list.get(index));
                    else
                        System.out.println("Khong tim thay sv");
                    break;
                case 0:
                    break;
            }
        }while(op!=0);
    }
}
