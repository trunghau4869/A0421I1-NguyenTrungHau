package CaseStudy.services.Impl;

import CaseStudy.model.Employee;
import CaseStudy.model.Facility;
import CaseStudy.model.House;
import CaseStudy.model.Villa;
import CaseStudy.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " so lan da thue : " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("nhap id");
        String idFacility = (scanner.nextLine());
        System.out.println("nhap ten");
        String nameService = scanner.nextLine();
        System.out.println("nhap dien tich");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap gia tien");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so luong nguoi");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kieu thue");
        String styleRental = (scanner.nextLine());
        System.out.println("nhap tieu chuan");
        String standardVilla = scanner.nextLine();
        System.out.println("nhap dien tich ho boi");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so tang");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("da them moi villa thanh cong");
    }

    @Override
    public void addNewHouse() {
        System.out.println("nhap id");
        String idFacility = (scanner.nextLine());
        System.out.println("nhap ten");
        String nameService = scanner.nextLine();
        System.out.println("nhap dien tich");
        double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap gia tien");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap so luong nguoi");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kieu thue");
        String styleRental = (scanner.nextLine());
        System.out.println("nhap tieu chuan");
        String standardVilla = scanner.nextLine();
        System.out.println("nhap dien tich ho boi");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap so tang");
        int floor = Integer.parseInt(scanner.nextLine());
        House house=new House(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityIntegerMap.put(house,0);
        System.out.println("da them house thanh cong");
    }

    @Override
    public void addNewRoom() {

    }
}
