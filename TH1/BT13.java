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
public class BT13 { 
    public static void main(String[] args) {
        String path="D:/DoiTuyenQuocGiaVN.txt";
        File f=new File(path);
        String line;
        int ct=0,num=0,td=0,tv=0,hv=0,tm=0;
        try{
            Scanner sc=new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();
            while(sc.hasNextLine()){
                ct+=1;
                line=sc.nextLine();
                String[] att=line.split(",");
                if(Integer.parseInt(att[2])<20){
                    num++;
                }
                if(line.contains("Tien ve"))
                    tv+=1; 
                else if(line.contains("Hau ve"))
                    hv+=1;
                else if(line.contains("Thu mon"))
                    tv+=1;
                else
                    td+=1;
            }
            System.out.printf("So cau thu la: %d\n", ct);
            System.out.printf("So cau thu so ao nho hon 20 la %d\n", num);
            System.out.printf("So tien ve la: %d\n", tv);
            System.out.printf("So hau ve la: %d\n", hv);
            System.out.printf("So tien dao la: %d\n", td);
            System.out.printf("So thu mon la: %d\n", tm);
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
