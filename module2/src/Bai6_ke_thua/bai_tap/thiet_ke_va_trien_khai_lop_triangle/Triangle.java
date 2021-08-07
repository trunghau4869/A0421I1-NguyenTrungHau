package Bai6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class Triangle {
    public double side1;
    public double side2;
    public double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double S=Math.sqrt(getPerimiter()*(getPerimiter()-side1)*(getPerimiter()-side2)*(getPerimiter()-side3));
        return S;
    }

    public double getPerimiter() {
        double P = side1 + side2 + side3;
        return P;
    }

    @Override
    public String toString() {
        return
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 ;
    }
}
