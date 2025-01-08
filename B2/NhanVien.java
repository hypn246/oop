/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2;

/**
 *
 * @author admin
 */
public abstract class NhanVien {
    private String maSo, hoTen;

    public NhanVien(String ms, String hoTen) {
        this.maSo=ms;
        this.hoTen = hoTen;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
     public double tinhLuong() {
        return 0; 
    }

    @Override
    public String toString() {
        return "Ma so: " + maSo + ", Ho ten: " + hoTen + ", Luong: " + tinhLuong();
    }
}
