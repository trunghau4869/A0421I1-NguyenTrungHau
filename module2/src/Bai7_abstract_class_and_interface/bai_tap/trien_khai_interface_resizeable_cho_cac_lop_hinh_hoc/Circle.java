package Bai7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Circle implements Resizeable {
    @Override
    public void resize(double percent) {
        double resuit=Math.floor(getArea()+(getArea()/100*percent));
        System.out.println("Circle dau khi tang len "+Math.floor(percent) +" pham tram la "+resuit);
    }

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

}
