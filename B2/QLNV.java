/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class QLNV{
    private static int id=0;
    private ArrayList<NhanVien> list;
    {
        if (id > 9999) {
            throw new IllegalStateException("khong the tao them nhan vien");
        }
        id++;
        String ms = String.format("%04d", id);
    }

    public QLNV() {
        list=new ArrayList();
    }
    public void themNV(NhanVien nv){
        list.add(nv);
    }
    
    public void xoaNV(NhanVien nv) {
        list.remove(nv);
    }
    public void hienThi() {
        for (NhanVien nv : list) {
            System.out.println(nv);
    }
    }
    public void tinhLuong() {
        list.sort(Comparator.comparingDouble(NhanVien::tinhLuong));
            hienThi();
    }
}
