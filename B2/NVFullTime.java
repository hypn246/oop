/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2;

/**
 *
 * @author admin
 */
public class NVFullTime extends NhanVien{
    private double luongCoBan;

    public NVFullTime(double luongCoBan, String ms, String hoTen) {
        super(ms, hoTen);
        this.luongCoBan = luongCoBan;
    }

    
    @Override
    public double tinhLuong(){
        return luongCoBan;
    }
    @Override
    public String toString(){
        return "";
    
    }
}
