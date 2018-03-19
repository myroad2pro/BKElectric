/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkelectric;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class KhachHang {
    protected String maKH, hoTen;
    protected LocalDate ngayHoaDon;
    protected double soLuong, donGia;
    
    // setters
    protected void setMaKH(String ms){
        this.maKH = ms;
    }
    
    protected void setHoTen(String name){
        this.hoTen = name;
    }
    
    protected void setNgayHoaDon(int ngay, int thang, int nam){
        this.ngayHoaDon = LocalDate.of(nam, thang, ngay);
    }
    
    protected void setSoLuong(double sl){
        this.soLuong = sl;
    }
    
    protected void setDonGia(double dg){
        this.donGia = dg;
    }
    // getters
    protected String getMaKH(){
        return this.maKH;
    }
    
    protected String getHoTen(){
        return this.hoTen;
    }
    
    protected LocalDate getNgayHoaDon(){
        return this.ngayHoaDon;
    }
    
    protected double getSoLuong(){
        return this.soLuong;
    }
    
    protected double getDonGia(){
        return this.donGia;
    }
    // constructor
    protected KhachHang(){
        this.setMaKH("");
        this.setHoTen("");
        this.setNgayHoaDon(1, 1, 1);
        this.setSoLuong(0);
        this.setDonGia(0);
    }
    
    protected KhachHang(String ms, String name, int ngay, int thang, int nam, double sl, double dg){
        this.setMaKH(ms);
        this.setHoTen(name);
        this.setNgayHoaDon(ngay, thang, nam);
        this.setSoLuong(sl);
        this.setDonGia(dg);
    }
    // methods
    protected void nhapHoaDon(){
        this.setMaKH(JOptionPane.showInputDialog("Ma Khach Hang: "));
        this.setHoTen(JOptionPane.showInputDialog("Ho Ten Khach Hang: "));
        this.setSoLuong(Double.parseDouble(JOptionPane.showInputDialog("So Luong: ")));
        this.setDonGia(Double.parseDouble(JOptionPane.showInputDialog("Don Gia: ")));
        int ngay = Integer.parseInt(JOptionPane.showInputDialog("Ngay Nhap: "));
        int thang = Integer.parseInt(JOptionPane.showInputDialog("Thang Nhap: "));
        int nam = Integer.parseInt(JOptionPane.showInputDialog("Nam Nhap: "));
        this.setNgayHoaDon(ngay, thang, nam);
    }
    
    protected String xuatHoaDon(){
        return "Ma Khach Hang: " + this.getMaKH() + "\nHo Ten Khach Hang: " + this.getHoTen()
                + "\nSo Luong: " + this.getSoLuong() + "\nDon Gia: " + this.getDonGia()
                + "\nNgay Nhap: " + this.getNgayHoaDon().toString();
    }
    
    protected double getThanhTien(){
        return this.getDonGia() * this.getSoLuong();
    }
}
