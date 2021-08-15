package Bai7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square implements Resizeable{
    @Override
    public void resize(double percent) {

    }
    private String color = "green";
    private boolean filled = true;

    public Square() {
    }

    public Square(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Square with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
