/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QLHinh {
    private ArrayList<Hinh> list;

    public QLHinh() {
        list=new ArrayList<>();
    }
    public void add(Hinh h){
        list.add(h);
    }
    public void del(Hinh h){
        list.remove(h);
    }
    public void show(){
        for(Hinh h:list){
            System.out.println(h);
        }
    }
    public void ss(){
    }
    public void sx(){
//        list.sort((h1,h2)->h1.ss(h2));
    }
    public void findByClass(String n) throws ClassNotFoundException{
        Class c=Class.forName(n);
        list.stream().filter(h->c.isInstance(h)).forEach(h->System.out.println(h));
    }

}
