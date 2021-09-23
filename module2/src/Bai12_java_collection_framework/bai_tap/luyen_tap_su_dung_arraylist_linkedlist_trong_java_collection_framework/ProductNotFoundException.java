package Bai12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException (String message){
        super(message);
    }
    public ProductNotFoundException (){
        super("khong tim thay san pham");
    }
}
