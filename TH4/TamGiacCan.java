/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4;

/**
 *
 * @author admin
 */
public class TamGiacCan extends TamGiac{
    private double ab,c;

    public TamGiacCan(double ab,  double c, String ten) {
        super(ab,ab, c, ten);
        this.ab = ab;
        this.c = c;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }
    @Override
    public void setC(double c) {
        this.c = c;
    }

    public void setAB(double a) {
        this.ab = a;
    }
    
}
