/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem a;
    private Diem b;
    public DoanThang(Diem dau, Diem cuoi) {
        a=dau;
        b=cuoi;
    }

    @Override
    public String toString() {
        return String.format("[(%.1f, %.1f), (%.1f, %.1f)]\n", a.getHoanhDo(), a.getTungDo(), b.getHoanhDo(), b.getTungDo());
    }
    
    public double doDai(){
        return a.tinhKC(b);
    }
    
    public Diem trungDiem(){
        return new Diem((a.getHoanhDo()+b.getHoanhDo())/2, (b.getTungDo()+a.getTungDo())/2);
    }
    
    public boolean songSong(DoanThang ss){
        return (this.a.getHoanhDo()-this.b.getHoanhDo())/(this.a.getTungDo()-this.b.getTungDo())==(ss.a.getHoanhDo()-ss.b.getHoanhDo())/(ss.a.getTungDo()-ss.b.getTungDo());
    }
    public static void main(String[] args) {
        Diem A=new Diem(1,4);
        Diem B=new Diem(3,5);
        Diem C=new Diem(7,5);
        Diem D=new Diem(-1,6);
        DoanThang a=new DoanThang(A, B);
        DoanThang b=new DoanThang(C, D);
        System.out.printf("%.1f",a.doDai());
    }
}
