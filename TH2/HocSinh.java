/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author admin
 */
public class HocSinh {
    private int count=0;
    private String hoten, mssv, quequan;
    private Date ngaysinh;
    private double diemtoan, diemvan, diemanh;
    {
        count++;
    }

    public HocSinh(String hoten, String quequan, Date ngaysinh, double diemtoan, double diemvan, double diemanh) {
        this.hoten = hoten;
        this.quequan = quequan;
        this.ngaysinh = ngaysinh;
        this.diemtoan = diemtoan;
        this.diemvan = diemvan;
        this.diemanh = diemanh;
        this.mssv=String.format("HS-f03.d", count);
    }

    public String getHoten() {
        return hoten;
    }
    public String getMssv() {
        return mssv;
    }
    public String getQuequan() {
        return quequan;
    }
    public Date getNgaysinh() {
        return ngaysinh;
    }
    public double getDiemtoan() {
        return diemtoan;
    }
    public double getDiemvan() {
        return diemvan;
    }
    public double getDiemanh() {
        return diemanh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }
    public void setDiemvan(double diemvan) {
        this.diemvan = diemvan;
    }
    public void setDiemanh(double diemanh) {
        this.diemanh = diemanh;
    }
    
    @Override
    public String toString(){
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Ten: %s\n Ngay sinh: %s\nQue quan:%s\nMSSV: %s\nDiem toan%.2f\nDiem van:%.2f\nDiem anh%.2f\n",
                hoten, df.format(ngaysinh), quequan, mssv, diemtoan, diemvan,diemanh);
    }
    
    public int tuoi(){
        Calendar currentdate=Calendar.getInstance();
        Calendar ns=Calendar.getInstance();
        ns.setTime(ngaysinh);
        return ns.get(Calendar.YEAR)-currentdate.get(Calendar.YEAR);
    }
    public static void main(String[] args) {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        HocSinh hs1=new HocSinh("Nguyen van a","HCM",df.parse("28-1-2024"), 6.8,9.5,7.9);
        System.out.println(hs1.toString());
    }
}
