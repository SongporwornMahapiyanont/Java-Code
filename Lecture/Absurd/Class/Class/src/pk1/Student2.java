package pk1;

import java.util.Scanner;

public class Student2 {
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
                
                }
        }
