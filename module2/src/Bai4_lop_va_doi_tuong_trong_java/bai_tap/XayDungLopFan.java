package Bai4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopFan {
    private int speed;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public XayDungLopFan() {

    }

    public XayDungLopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        if (on == true) {
            System.out.println(
            " speed=" + speed +
            ", on=" + on +
            ", radius=" + radius +
            ", color='" + color  +
            ",Fan is on"
            );
        } else {
            System.out.println(
            " speed=" + speed +
            ", on=" + on +
            ", radius=" + radius +
            ", color='" + color + '\'' + ",Fan is off"
            );
        }
        return null;
    }

    public static void main(String[] args) {
        XayDungLopFan Fan1 = new XayDungLopFan(3, true, 10, "yellow");
        XayDungLopFan Fan2 = new XayDungLopFan(2, false, 5, "blue");
        Fan1.toString();
        Fan2.toString();
    }
}




