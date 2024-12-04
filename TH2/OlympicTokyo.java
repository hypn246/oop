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
public class OlympicTokyo {
    static ArrayList<QuocGia> arrQG = new ArrayList<>();
    static ArrayList<ThanhTich> arrTT =new ArrayList<>();
    public void timTen(String find){
    }

    public static void main(String[] args) {
        String path="C:\\Users\\admin\\Desktop\\Top20TokyoInfo.txt";
        File f=new File(path);
        String line[];
        try{
            Scanner sc=new Scanner(f);
            sc.nextLine();
            while(sc.hasNextLine()){
                line=sc.nextLine().split(",");
                arrQG.add(new QuocGia(
                        line[0],
                        line[1], 
                        Integer.parseInt(line[2]),
                        Integer.parseInt(line[3]))
                );
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        path="C:\\Users\\admin\\Desktop\\Top20Tokyo.txt";
        f=new File(path);
        try{
            Scanner sc=new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            String nuoc[]=sc.nextLine().split(",");
            for(int i=0;i<20;i++){
                line=sc.nextLine().split(",");
                arrTT.add(new ThanhTich(
                        nuoc[i],
                        Integer.parseInt(line[0]),
                        Integer.parseInt(line[1]),
                        Integer.parseInt(line[2])
                ));
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
