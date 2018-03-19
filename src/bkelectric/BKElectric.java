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
public class BKElectric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 0;
        QuanLyHoaDon qlhd = new QuanLyHoaDon();

        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Chuong Trinh Quan Ly Hoa Don Tien Dien\n"
                    + "0. Exit\n"
                    + "1. Them Hoa Don Khach Hang Viet Nam\n"
                    + "2. Them Hoa Don Khach Hang Nuoc Ngoai\n"
                    + "3. Xuat Danh Sach Hoa Don Khach Hang Viet Nam\n"
                    + "4. Xuat Danh Sach Hoa Don Khach Hang Nuoc Ngoai\n"
                    + "5. Tinh Tong Dien Nang Tieu Thu Cua Khach Hang Viet Nam\n"
                    + "6. Tinh Tong Dien Nang Tieu Thu Cua Khach Hang Nuoc Ngoai\n"
                    + "7. Tinh Trung Binh Thanh Tien Hoa Don Khach Hang Nuoc Ngoai\n")
                    + "8. Xuat Hoa Don Khach Hang Theo Thang\n"
            );
            switch (choice) {
                case 0:
                    break;
                case 1:
                    qlhd.nhapDanhSachKhachHang(0);
                    break;
                case 2:
                    qlhd.nhapDanhSachKhachHang(1);
                    break;
                case 3:
                    qlhd.xuatDanhSachKhachHang(0);
                    break;
                case 4:
                    qlhd.xuatDanhSachKhachHang(1);
                    break;
                case 5:
                    System.out.println("Tong Dien Nang Tieu Thu Cua Khach Hang Viet Nam: "+ 
                            qlhd.getTongDienNangTieuThu(0));
                    break;
                case 6:
                    System.out.println("Tong Dien Nang Tieu Thu Cua Khach Hang Nuoc Ngoai: "
                    + qlhd.getTongDienNangTieuThu(1));
                    break;
                case 7:
                    System.out.println("Trung Binh Thanh Tien Hoa Don Khach Hang Nuoc Ngoai: "
                    + qlhd.getTrungBinhThanhTien(1));
                    break;
                case 8:
                    qlhd.xuatDanhSachKhachHangTheoThang();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
