/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2;

/**
 *
 * @author admin
 */
public class NVPartTime extends NhanVien{
    private int soGioLamViec;
    private double luongTheoGio;

    public NVPartTime(int soGioLamViec, double luongTheoGio, String ms, String hoTen) {
        super(ms, hoTen);
        this.soGioLamViec = soGioLamViec;
        this.luongTheoGio = luongTheoGio;
    }

    
        @Override
    public double tinhLuong(){
        return this.soGioLamViec*this.luongTheoGio;
    }
    @Override
    public String toString(){
        return "";
    
    }
}
