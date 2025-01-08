/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4;

/**
 *
 * @author admin
 */
public class TamGiac extends Hinh{
    double a, b, c;

    public TamGiac(double a, double b, double c, String ten) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
        @Override
    public double tinhP(){
        return a+b+c;
    }
    @Override
    public double tinhS(){
        return (a+b+c)/2;
    }
}
