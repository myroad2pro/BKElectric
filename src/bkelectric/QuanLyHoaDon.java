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
public class QuanLyHoaDon {
    private KhachHang[] danhSachKhachHang;
    private int[] loaiKH;
    private int countKH;
    private double tongThanhTienVN, tongThanhTienNN;
    // setters
    public void setKhachHang(int max){
        this.danhSachKhachHang = new KhachHang[max];
        loaiKH = new int[max];
    }
    // getters
    public KhachHang[] getDanhSachKhachHang(){
        return this.danhSachKhachHang;
    }
    
    public int getCountKH(){
        return this.countKH;
    }
    
    public double getTongThanhTienVN(){
        return this.tongThanhTienVN;
    }
    
    public double getTongThanhTienNN(){
        return this.tongThanhTienNN;
    }
    // constructor
    public QuanLyHoaDon(){
        this.setKhachHang(1);
        this.countKH = 0;
        this.tongThanhTienVN = 0;
        this.tongThanhTienNN = 0;
    }
    
    public QuanLyHoaDon(int maxSLKH){
        this.setKhachHang(maxSLKH);
        this.countKH = 0;
        this.tongThanhTienNN = 0;
        this.tongThanhTienVN = 0;
    }
    // methods
    public void nhapDanhSachKhachHang(int mode){// 0: VN, 1: NN
        switch(mode){
            case 0:
                this.danhSachKhachHang[this.countKH] = new KhachHangVN();
                this.loaiKH[this.countKH] = 0;
                KhachHangVN khVN = new KhachHangVN();
                khVN.nhapHoaDon();
                this.danhSachKhachHang[this.countKH++] = khVN;
                this.tongThanhTienVN += khVN.getThanhTien();
                break;
            case 1:
                this.danhSachKhachHang[this.countKH] = new KhachHangNN();
                this.loaiKH[this.countKH] = 1;
                KhachHangNN khNN = new KhachHangNN();
                khNN.nhapHoaDon();
                this.danhSachKhachHang[this.countKH++] = khNN;
                this.tongThanhTienNN += khNN.getThanhTien();
                break;
            default:
        }
    }
    
    public void xuatDanhSachKhachHang(int mode){
        for(int i = 0; i < this.countKH; i++){
            if(this.loaiKH[i] == mode){
                System.out.println("--------------------/------/-----------------------");
                System.out.println(danhSachKhachHang[i].xuatHoaDon());
            }   
        }
    }
    
    public void xuatDanhSachKhachHangTheoThang(){
        int thang = Integer.parseInt(JOptionPane.showInputDialog("Thang Nhap: "));
        int nam = Integer.parseInt(JOptionPane.showInputDialog("Nam Nhap: "));
        for(int i = 0; i < this.countKH; i++){
            if(this.danhSachKhachHang[i].getNgayHoaDon().getMonthValue() == thang
                    && this.danhSachKhachHang[i].getNgayHoaDon().getYear() == nam){
                System.out.println("--------------------/------/-----------------------");
                System.out.println(danhSachKhachHang[i].xuatHoaDon());
            }   
        }
    }
    
    public double getTongDienNangTieuThu(int mode){
        double tongDienNangTieuThu = 0;
        for(int i = 0; i < countKH; i++){
            if(this.loaiKH[i] == mode){
                tongDienNangTieuThu += this.danhSachKhachHang[i].getSoLuong();
            }
        }
        return tongDienNangTieuThu;
    }
    
    public double getTrungBinhThanhTien(int mode){
        int soKH = 0;
        for(int i = 0; i < this.countKH; i++){
            if(this.loaiKH[i] == mode){
                soKH++;
            }   
        }
        switch(mode){
            case 0:
                return this.getTongThanhTienVN() / soKH;
            case 1:
                return this.getTongThanhTienNN() / soKH;
            default:
                return 0;
        }
    }
}
