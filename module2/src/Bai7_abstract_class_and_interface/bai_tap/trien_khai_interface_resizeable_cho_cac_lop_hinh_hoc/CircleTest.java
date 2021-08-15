package Bai7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
    Circle circle=new Circle(5);
        System.out.println("dien tich ban dau cua Circle la : "+circle.getArea());
       circle.resize(Math.random()*100+1);
    }
}
