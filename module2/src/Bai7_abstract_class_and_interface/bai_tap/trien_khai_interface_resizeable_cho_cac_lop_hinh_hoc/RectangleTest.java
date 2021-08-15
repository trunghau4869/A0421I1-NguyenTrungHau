package Bai7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5,6);
        System.out.println("dien tich ban dau cua Circle la : "+rectangle.getArea());
        rectangle.resize(Math.random()*100+1);
    }

}
