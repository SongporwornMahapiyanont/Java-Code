import java.util.Scanner;
import java.util.zip.CRC32;
import pk1.Student;


public class Tesert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("start s1 = " + s1.gpa_public);
        s1.gpa_public = 1.5;
        s1.gpa_package = 3.0;
        s1.gpa_private = 3.4;

        s1.test_access_package();
        s1.test_access_public();
        s1.test_access_private();
        s1.get_gpa_private();
        s1.set_gpa_private(2.5);
        // s1.gpa_private = 1.4; can not access or print because it's a private 

    }
}

// class Student{
//     double gpa;
//     private double gpa_private;
//     void test_access(){
//         gpa_private = 3.5;
//     }
// }

