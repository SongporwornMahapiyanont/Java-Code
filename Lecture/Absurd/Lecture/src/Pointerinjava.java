import java.util.Scanner;

public class Pointerinjava {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int []A = new int[10];
        int []B = new int[10];


        A.clone(); // the firstest Address A its. 
        A = B;
        A[5] = 10; // or B[5] = 10; finally the result, it's same

        
        for(int i=0;i<10;i++)
        {
            System.out.println("address A.clone = " + A.clone());
            System.out.println("address A = " + A);
            System.out.println("A = " + A[i]);
            System.out.println("B = " + B[i]);
        }
    }
}
