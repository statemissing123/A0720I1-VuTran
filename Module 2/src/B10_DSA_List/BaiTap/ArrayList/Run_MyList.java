package B10_DSA_List.BaiTap.ArrayList;

import B5_Access_moderfier.Thuc_Hanh.Static_Method.LT_Static;

public class Run_MyList {
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
        Student student1 = new Student(1,"Tran");
        Student student2 = new Student(2,"Le");
        Student student3 = new Student(3,"Viet");
        Student student4 = new Student(4,"Vu");
        Student student5 = new Student(5,"Handsome");
        Student student6 = new Student(6,"VIP");

        MyList<Student>studentMyList=new MyList<>();
        MyList<Student>newMyList=new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
//        studentMyList.add(student6,2);

        studentMyList.size();

//        for (int i = 0; i<studentMyList.size();i++){
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());

//        System.out.println(studentMyList.contains(student6));
//        }
        newMyList = studentMyList.clone();
        newMyList.remove(1);
        for (int i = 0; i<studentMyList.size();i++){
            System.out.println(newMyList.get(i).getName());
        }


    }
}
