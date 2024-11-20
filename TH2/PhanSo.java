/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2;

/**
 *
 * @author admin
 */
public class PhanSo {
    private int tuso;
    private int mauso;
    
    public PhanSo (int t, int m){ 
        this.tuso=t;
        this.mauso=m;
    }
    public PhanSo(){
        tuso=0;
        mauso=1;
    }

    public int getTuso() {
        return tuso;
    }
    public int getMauso() {
        return mauso;
    }
    public void setTuso(int tuso) {
        this.tuso = tuso;
    }
    public void setMauso(int mauso) {
        this.mauso = mauso;
    }
    
    public static int ucln(int a, int b){
        if(b==0)
            return a;
        return ucln(b,a%b);
    }
    public PhanSo rutGon(){
        int u=ucln(this.tuso, this.mauso);
        this.setTuso((int)this.tuso/u);
        this.setMauso((int)this.mauso/u);
        return this;
    }
    
    public PhanSo cong(PhanSo two){
        int tm, mm;
        mm=this.mauso*two.mauso;
        tm=this.mauso*two.tuso+two.mauso*this.tuso;
        return new PhanSo(tm,mm).rutGon();
    }
    public PhanSo tru(PhanSo two){
        int tm, mm;
        mm=this.mauso*two.mauso;
        tm=this.tuso*two.mauso-two.tuso*this.mauso;
        return new PhanSo(tm,mm).rutGon();
    }
    public PhanSo nhan(PhanSo two){
        int tm, mm;
        mm=this.mauso*two.mauso;
        tm=this.tuso*two.tuso;
        return new PhanSo(tm,mm).rutGon();
    }
    public PhanSo chia(PhanSo two){
        int tm, mm;
        mm=this.mauso*two.tuso;
        tm=this.tuso*two.mauso;
        return new PhanSo(tm,mm).rutGon();
    }
    
    public int ss(PhanSo two){
        if(this.tuso*two.mauso==this.mauso*two.tuso)
            return 0;
        else if(this.tuso*two.mauso<this.mauso*two.tuso)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString(){
        if (mauso==1)
            return Integer.toString(tuso);
        return String.format("%d/%d", tuso,mauso);
    }
    
    public static void main(String[] args) {
        PhanSo ps1=new PhanSo(2,3);
        PhanSo ps2=new PhanSo(4,6);
        PhanSo ps3=new PhanSo(5,6);
        System.out.println(ps1.chia(ps2).toString());
        System.out.println(ps1.ss(ps3));
    }
    
}
