/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4;

/**
 *
 * @author admin
 */
public class run {
    public static void main(String[] args) {
        QLHinh list=new QLHinh();
        Hinh h1=new HinhChuNhat(3,4,"HCN");
        Hinh h2=new HinhVuong(5,"Vuong");
        Hinh h3=new TamGiac(3,7,4,"Tam giac");
        Hinh h4=new TamGiacCan(3,4,"TG can");
        Hinh h5=new TamGiacDeu(9,"TG deu");
        list.add(h5);
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        try{
            list.findByClass("TH4.HinhChuNhat");
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getCause());
        }
    }
}
