package Bai10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien;

public class MyListTest {
    public static class Student {
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

    public static void main(String[] args) {
        Student student1 = new Student(1, "Hau");
        Student student2 = new Student(2, "Nam");
        Student student3 = new Student(3, "Cong");
        Student student4 = new Student(4, "Nha");
        Student student5 = new Student(5, "Quang");
        Student student6 = new Student(5, "Quang2");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> NewstudentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        studentMyList.add(student6, 3);
        // studentMyList.clear();
        studentMyList.size();
//        for (int i = 0; i < studentMyList.size(); i++) {
//            Student student = (Student) studentMyList.element[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//
//        }
//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(2).getName());
        //System.out.println(studentMyList.indexOf(student3));
        //  System.out.println(studentMyList.contains(student3));
        NewstudentMyList = studentMyList.clone();
        Student student = NewstudentMyList.remove(3);
        System.out.println(student.getName());
//        for(int i=0;i<studentMyList.size();i++){
//            System.out.println(NewstudentMyList.get(i).getName());
//        }

    }


}
