/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BT12 { 
    public static void main(String[] args) throws FileNotFoundException {
        String path="D:/SinhVien.txt";
        File f=new File(path);
        PrintWriter note=new PrintWriter("D:/SinhVienCNTT.txt");
        String line;
        int qtkd=0,cntt=0;
        try{
            Scanner sc=new Scanner(f);
            sc.nextLine();
            while(sc.hasNextLine()){
                line=sc.nextLine();
                if(line.contains("Cong nghe thong tin")){
                    note.println(line);
                    cntt+=1;
                }
                if(line.contains("Quan tri kinh doanh"))
                    qtkd+=1;         
            }
            System.out.printf("So sinh vien qtkd la: %d\n", qtkd);
            System.out.printf("So sinh vien cntt la %d\n", cntt);
            sc.close();
            note.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
