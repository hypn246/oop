/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4;

/**
 *
 * @author admin
 */
public class HinhChuNhat extends Hinh{
    private double chieuDai, chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong, String ten) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    @Override
    public double tinhP(){
        return (chieuDai+chieuRong)*2;
    }
    @Override
    public double tinhS(){
        return chieuDai*chieuRong;
    }
}
