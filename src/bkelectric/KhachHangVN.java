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
public class KhachHangVN extends KhachHang{
    private int doiTuong;   // 0: sinh hoat, 1: kinh doanh, 2: san xuat
    private double dinhMuc;
    
    // setters
    public void setDoiTuong(int dt){
        this.doiTuong = dt;
    }
    
    public void setDinhMuc(double dm){
        this.dinhMuc = dm;
    }
    // getters
    public int getDoiTuong(){
        return this.doiTuong;
    }
    
    public double getDinhMuc(){
        return this.dinhMuc;
    }
    // constructor
    public KhachHangVN(){
        super();
        this.setDoiTuong(0);
        this.setDinhMuc(0);
    }
    
    public KhachHangVN(String ms, String name, int ngay, int thang, int nam, double sl, double dg,
            int dt, double dm){
        super(ms, name, ngay, thang, nam, sl, dg);
        this.setDoiTuong(dt);
        this.setDinhMuc(dm);
    }
    // methods
    public void nhapHoaDon(){
        super.nhapHoaDon();
        this.setDoiTuong(
                JOptionPane.showConfirmDialog(null, "Doi Tuong Khach Hang: Sinh Hoat?")==0?0:
                JOptionPane.showConfirmDialog(null, "Doi Tuong Khach Hang: Kinh Doanh?")==0?1:2);
        this.setDinhMuc(Double.parseDouble(JOptionPane.showInputDialog("Dinh Muc: ")));
    }
    
    public String xuatHoaDon(){
        String doiTuong;
        if(this.getDoiTuong() == 0) doiTuong = "Sinh Hoat";
        else if(this.getDoiTuong() == 1) doiTuong = "Kinh Doanh";
        else doiTuong = "San Xuat";
        return super.xuatHoaDon() + "\nDoi Tuong Khach Hang: " + doiTuong 
                + "\nDinh Muc: " + this.getDinhMuc();
    }
    
    public double getThanhTien(){
        if(this.getSoLuong() <= this.getDinhMuc()) return this.getSoLuong() * this.getDonGia();
        else return this.getDinhMuc() * this.getDonGia() 
                + (this.getSoLuong() - this.getDinhMuc()) * this.getDonGia() * 2.5;
    }
}
