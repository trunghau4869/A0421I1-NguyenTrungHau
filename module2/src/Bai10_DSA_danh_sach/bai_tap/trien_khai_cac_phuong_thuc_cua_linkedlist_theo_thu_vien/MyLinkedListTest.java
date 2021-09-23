package Bai10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<>();
        Student student1=new Student(1,"hau");
        Student student2=new Student(1,"hau2");
        Student student3=new Student(1,"hau3");

       myLinkedList.addFirst(student1);
       myLinkedList.addFirst(student3);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(2, student2);
        myLinkedList.remove(1);
        System.out.println(myLinkedList.contains(student2));
        System.out.println(myLinkedList.indexOf(student3));

    }
}
