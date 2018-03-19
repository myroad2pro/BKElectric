/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkelectric;

import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class KhachHangNN extends KhachHang{
    private String quocTich;
    // setters
    public void setQuocTich(String qt){
        this.quocTich = qt;
    }
    // getters
    public String getQuocTich(){
        return this.quocTich;
    }
    // constructor
    public KhachHangNN(){
        super();
        this.setQuocTich("");
    }
    
    public KhachHangNN(String ms, String name, int ngay, int thang, int nam, double sl, double dg,
            String qt){
        super(ms, name, ngay, thang, nam, sl, dg);
        this.setQuocTich(qt);
    }
    // methods
    public void nhapHoaDon(){
        super.nhapHoaDon();
        this.setQuocTich(JOptionPane.showInputDialog("Quoc Tich: "));
    }
    
    public String xuatHoaDon(){
        return "Quoc Tich" + this.getQuocTich() + "\n" + super.xuatHoaDon();
    }
    
    public double getThanhTien(){
        return this.getDonGia() * this.getSoLuong();
    }
}
