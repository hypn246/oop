/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DsPhanSo {
//    private static ArrayList<PhanSo> list;
    public static ArrayList<PhanSo> list=new ArrayList<>();
    public DsPhanSo() {
        list =new ArrayList<>();
    }
    public boolean add(PhanSo ps){
        return list.add(ps);
    }
    public boolean del(PhanSo ps){
        return list.remove(ps);
    }
    public PhanSo sum(){
        PhanSo t=new PhanSo();
        for (PhanSo p:list){
            t=t.cong(p);
        }
        return t.rutGon();
    }
    //error
    public void sort(){
        list.sort((PhanSo ps1, PhanSo ps2)->{
            return ps1.ss(ps2);
        });
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        list.forEach((PhanSo ps)->{
            sb.append(ps.toString()).append("\n");
        });
        return sb.toString();
    }
    public static void main(String[] args) {
        list.add(new PhanSo(1,5));
        list.add(new PhanSo(1,2));
        list.add(new PhanSo(-1,4));
        list.add(new PhanSo());
        System.out.println(list.toString());
    }
}
