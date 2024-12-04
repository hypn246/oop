/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QLHS {
    static ArrayList<HocSinh> list = new ArrayList<>();
    public void them(HocSinh n, String path){
        try{
            FileWriter f=new FileWriter(path, true);
            PrintWriter w=new PrintWriter(f);
            w.printf("\n%s, %s, %s, %.1f, %.1f, %.1f", n.getHoTen(),n.getNgaySinh(), n.getQueQuan(), n.getToan(), n.getAnh(), n.getVan());
            w.close();
        }catch(IOException e){
            e.getMessage();
        }
        
        list.add(n);
    }
    public boolean xoa(String ms){
        HocSinh kq=list.stream().filter(hs->hs.getMaSo().equalsIgnoreCase(ms)).findFirst().orElse(null);
        if(kq==null)
            return false;
        else
            return list.remove(kq);
    }
    public void sx(){
        list.sort( (HocSinh hs1, HocSinh hs2)->{
                return hs1.soSanh(hs2);
            }
        );
    }
    public static void main(String[] args) {
        String path="C:\\Users\\admin\\Desktop\\HocSinh.txt";
        File f=new File(path);
        String line[];
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        try{
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                line=sc.nextLine().split(", ");
                list.add(new HocSinh(
                        line[0],
                        df.parse(line[1]),
                        line[2],
                        Double.parseDouble(line[3]),
                        Double.parseDouble(line[4]),
                        Double.parseDouble(line[5])));
            }
                System.out.println(list.toString());
        }
        catch(FileNotFoundException | ParseException e){
            System.out.println(e.getMessage());
        }
    }
}
