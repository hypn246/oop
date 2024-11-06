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
public class BT11 { 
    public static void main(String[] args) {
        String path="D:/SV-HS-CD.txt";
        File f=new File(path);
        String line;
        int sv=0,hs=0,cd=0;
        try{
            Scanner sc=new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();
            while(sc.hasNextLine()){
                line=sc.nextLine();
                String[] att=line.split(",");
                if(Character.isLetter(att[0].charAt(0)))
                    hs+=1;
                else{
                    if(Character.isUpperCase(line.charAt(line.length()-1)))
                        sv+=1;
                    else
                        cd+=1;
                }
            }
            System.out.printf("So hoc sinh la: %d\n", hs);
            System.out.printf("So sinh vien la %d\n", sv);
            System.out.printf("So cong dan la %d\n", cd);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
