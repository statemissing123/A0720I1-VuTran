package B5_Access_moderfier.Thuc_Hanh.Static_Method;

public class LT_Static_2 {
    public static void main(String[] args) {
        LT_Static.Student.change(); //calling change method

        //creating objects
        LT_Static.Student s1 = new LT_Static.Student(111, "Hoang");
        LT_Static.Student s2 = new LT_Static.Student(222, "Khanh");
        LT_Static.Student s3 = new LT_Static.Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
