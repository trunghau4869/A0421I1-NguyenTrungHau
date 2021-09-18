package Bai10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien;

public class Node {
    private Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
