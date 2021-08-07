package Bai6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(3,4,5);
        System.out.println(triangle.getPerimiter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}
