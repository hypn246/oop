/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
public class QuocGia {
    String tenNuoc;
    String thuDo;
    int danSo;
    int dienTich;

    public QuocGia(String tenNuoc, String thuDo, int danSo, int dienTich) {
        this.tenNuoc = tenNuoc;
        this.thuDo = thuDo;
        this.danSo = danSo;
        this.dienTich = dienTich;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public String getThuDo() {
        return thuDo;
    }

    public void setThuDo(String thuDo) {
        this.thuDo = thuDo;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return String.format("Ten nuoc: %s\nThu do: %s\nDan so: %d\nDien tich: %d\n", this.tenNuoc, this.thuDo, this.danSo, this.dienTich);
    }
}
