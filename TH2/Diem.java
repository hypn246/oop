/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
public class Diem {
    private double tungDo;
    private double hoanhDo;
    
    public Diem(){
        tungDo=0;
        hoanhDo=0;
    }
    public Diem(double x, double y){
        tungDo=x;
        hoanhDo=y;
    }

    public double getTungDo() {
        return tungDo;
    }

    public double getHoanhDo() {
        return hoanhDo;
    }

    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }
    
    public double tinhKC(Diem b){
        return Math.sqrt(Math.pow((this.tungDo-b.tungDo),2)+Math.pow((this.hoanhDo-b.hoanhDo),2));
    }
    @Override
    public String toString() {
        return String.format("(%.1f, %.1f", hoanhDo, tungDo);
    }
    public static void main(String[] args) {
        System.out.println("");
    }
}
