package BasicJavaRule;

import java.util.ArrayList; // ArrayList will cannot record Data primitive only. 
import java.util.Scanner; // It's Library

public class Basic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(1 / -0.1); // signature of Java Interger is alway Signed interger ( -value and 0 and
                                      // +value).
        int[] a = new int[6];
        for (int value : a) // if we do not set value give Array (Array only), Value of it eveything will =
                            // 0
        {
            System.out.println("a = " + value);
        }
        boolean[] b = new boolean[6];
        for (boolean value : b) // if we do not set value give Array (Array only), Value of it eveything will =
                                // false.
        {
            System.out.println("b = " + value);
        }

        int x = 7; // 7 it's Literal
        boolean y = false; // false it's Literal
        double z = 1.2123; // 1.2123 it's Literal

        int[] A = new int[5];
        a = A.clone(); // method for copy old Address.
        int[] B = new int[5];
        A = B; // Array A and Array B it's same. (Pointer) and Address of Array A will be
               // garbage.
        A[4] = 5; // value A[4] and B[4] = 5 because Address A and B it's same.
        for (int i = 0; i < 5; i++) {
            System.out.println("Address A.clone = " + A.clone()[i]);
            System.out.println("Address A = " + A);
            System.out.println("Address B = " + B);
            System.out.println("A = " + A[i]);
            System.out.println("B = " + B[i]);
        }
        scan.close();
    }
}
