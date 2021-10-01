package exam.controller;

import Bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.Product;
import Bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework.ProductNotFoundException;
import exam.model.SanPham;
import exam.model.SanPhamNhapKhau;
import exam.model.SanPhamXuatKhau;
import exam.services.Impl.SanPhamNhapKhauImpl;
import exam.services.Impl.SanPhamXuatKhauImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    static Scanner scanner = new Scanner(System.in);
    private static List<SanPham> danhSachSanPham;

    static {
        danhSachSanPham = new ArrayList<>();
    }


    public static void main(String[] args) {
        display();
    }

    public static void display() {
        while (true) {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sach các sản phẩm ");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("chọn  chức năng :");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    themSanPham();
                    break;
                case 2:

                    break;
                case 3:
                    hienThiSanPham();
                    break;
                case 4:
                    //   timKiem();
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }

    public static void themSanPham() {
        SanPhamXuatKhauImpl sanPhamXuatKhau=new SanPhamXuatKhauImpl();
        SanPhamNhapKhauImpl sanPhamNhapKhau=new SanPhamNhapKhauImpl();
        while (true) {
            System.out.println("1. Thêm sản phẩm nhập khẩu");
            System.out.println("2. Thêm sản phẩm xuất khẩu");
            System.out.println("3. Quay lại");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    sanPhamNhapKhau.themSanPhamNhapKhau();
                    break;
                case 2:
                    sanPhamXuatKhau.themSanPhamXuatKhau();
                    break;
                case 3:
                    display();
            }

        }
    }


    public static void hienThiSanPham() {
        SanPhamXuatKhauImpl sanPhamXuatKhau=new SanPhamXuatKhauImpl();
        SanPhamNhapKhauImpl sanPhamNhapKhau=new SanPhamNhapKhauImpl();
//        for (SanPhamNhapKhauImpl danhSachSanPhamNhapKhau : danhSachSanPhamNhapKhau) {
//            System.out.println(danhsach);
//        }
//        for (SanPhamXuatKhauImpl danhsach : danhSachSanPhamNhapKhau) {
//            System.out.println(danhsach);
//        }
    }

    public static SanPham timKiem(int id) throws ProductNotFoundException {
        SanPham sanPham = null;
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).getId() == id) {
                sanPham = danhSachSanPham.get(i);
            }
        }
        if (sanPham == null) {
            throw new ProductNotFoundException("khong co gi");
        }
        return sanPham;
    }
}
