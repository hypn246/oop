/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4;

/**
 *
 * @author admin
 */
public abstract class Hinh {
    private String ten;
    public Hinh(String ten){
        this.ten=ten;
    }
    public abstract double tinhS();
    public abstract double tinhP();
    @Override
    public String toString(){
        return String.format("%s\nChu vi: %.1f\nDien tich: %.1f\n",ten,tinhS(), tinhP());
    }
            
}
