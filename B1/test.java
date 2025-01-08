/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class test {
    //list b1
    private ArrayList<CongDan> list;

    public test() {
        this.list = new ArrayList();
                String path="D:\\gradleproject4\\app\\src\\main\\java\\SV-HS-CD.txt";
        File f=new File(path);
        String line[];
        try{
            Scanner sc=new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();
            while(sc.hasNextLine()){
                line=sc.nextLine().split(",");
                if(line.length==6 && !line[0].contains(" ")){
                    String[] d=line[3].split("-");
                    list.add(new CongDan(
                            line[1]+" "+line[2],
                            line[0],
                            line[4],
                            line[5],
                            Integer.parseInt(d[0]),
                            Integer.parseInt(d[1]),
                            Integer.parseInt(d[2])
                    ));
                }else if(line.length==7){
                    String[] d=line[3].split("-");
                    list.add((CongDan) new SinhVien(
                            line[1]+line[2],
                            line[0],
                            line[5],
                            "Sinh vien",
                            Integer.parseInt(d[0]),
                            Integer.parseInt(d[1]),
                            Integer.parseInt(d[2]),
                            line[4],
                            line[6]
                    ));
                }
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void test() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Nhap ten tinh");
            System.out.println("2. Nhap nghe nghiep");
            System.out.println("3. Nhap truong DH");
            System.out.println("4. End");
            System.out.print("Chon chuc nang: ");

            int ch = scanner.nextInt();
            scanner.nextLine(); 

            switch (ch) {
                case 1: 
                    System.out.print("Nhap ten tinh thanh: ");
                    String noiSinh = scanner.nextLine();
                    for (CongDan cd : list) {
                        if (cd.getNoiSinh().equalsIgnoreCase(noiSinh)) {
                            System.out.println(cd);
                        }
                    }
                    break;

                case 2: 
                    System.out.print("Nhap nghe nghiep: ");
                    String ngheNghiep = scanner.nextLine();
                    for (CongDan cd : list) {
                        if (cd.getNgheNghiep().equalsIgnoreCase(ngheNghiep)) {
                            System.out.println(cd);
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Nhap theo truong dai hoc: ");
                    String daiHoc = scanner.nextLine();
                    for (CongDan cd : list) {
                        if (cd instanceof SinhVien && ((SinhVien) cd).getDaiHoc().equalsIgnoreCase(daiHoc)) {
                            System.out.println(cd);
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Ket thuc chuong trinh.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon k hop le");
            }
        }
    }
}
