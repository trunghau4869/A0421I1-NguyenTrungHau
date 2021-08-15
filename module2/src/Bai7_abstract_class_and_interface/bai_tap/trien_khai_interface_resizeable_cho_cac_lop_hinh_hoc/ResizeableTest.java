package Bai7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] resizeable=new Resizeable[3];
        resizeable[0]= new Circle();
        resizeable[1]= new Rectangle() ;
        resizeable[2]= new Square();
        for(Resizeable resizeable1:resizeable){
            System.out.println(resizeable1);
        }
    }
}
