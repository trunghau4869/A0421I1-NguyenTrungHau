package Bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

import CaseStudy.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSP {
    static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
    }

    public static void display() {

        while (true) {
            System.out.println("1.them san pham");
            System.out.println("2.sua san pham theo id");
            System.out.println("3.xoa san pham theo id");
            System.out.println("4.hien thi danh sach san pham");
            System.out.println("5.thoat!!!");
            System.out.println("---------------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    System.out.println("1.them san pham");
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    displayMenu();
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }

    public static void displayMenu() {
        for (Product list : productList) {
            System.out.println(list);
        }
    }

    public static void addProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
        System.out.println("nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("nhap gia san pham");
        String price = scanner.nextLine();
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    public static void deleteProduct() {
        try {
            System.out.println("nhap id san pham muon xoa");
            int id = Integer.parseInt(scanner.nextLine());
            Product product = findById(id);
            System.out.println("ban co muon xoa san pham nay khong" + product.getName() + "\n co" + "\n khong");
            if (scanner.nextLine().equals("co")) {
                productList.remove(product);
            } else {
                displayMenu();
            }

        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Product findById(int id) throws ProductNotFoundException {
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                product = productList.get(i);
            }
        }
        if (product == null) {
            throw new ProductNotFoundException("khong co gi");
        }
        return product;
    }
//    public static void editProduct(){
//        System.out.println("Nhap id san pham can sua: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        Product product = findById(id);
//        if (product != null) {
//            System.out.println("Chon:  ");
//            System.out.println("1. Name:  ");
//            System.out.println("2. Price: ");
//            System.out.println("3.Tro lai");
//            int choice = 1;
//            while (choice != 0) {
//                try {
//                    choice = Integer.parseInt(scanner.nextLine());
//                } catch (NumberFormatException e) {
//                    System.out.println("Nhap sai chuc nang, nhap lai: ");
//                }
//                switch (choice) {
//                    case 1:
//                        System.out.println("Enter new Name:");
//                        String name = scanner.nextLine();
//                        product.setName(name);
//                        display();
//                        break;
//                    case 2:
//                        System.out.println("Enter new Price:");
//                        String  price = scanner.nextLine();
//                        product.setPrice(price);
//                        display();
//                        break;
//                    case 3:
//                        return;
//                    default:
//                        System.out.println("Invalid choice! Exit!");
//                }
//            }
//        } else {
//            System.out.println("id not found");
//            editProduct();
//        }
//    }
}
