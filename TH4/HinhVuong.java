/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4;

/**
 *
 * @author admin
 */
public class HinhVuong extends HinhChuNhat{
    private double canh;

    public HinhVuong(double canh, String ten) {
        super(canh, canh, ten);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    @Override
    public double tinhP(){
        return canh*4;
    }
    @Override
    public double tinhS(){
        return canh*canh;
    }
}
