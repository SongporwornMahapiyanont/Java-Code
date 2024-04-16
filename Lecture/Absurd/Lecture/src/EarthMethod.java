import java.util.Scanner;

public class EarthMethod {
    public static int test (int x) // formal parameter
    { 
        int result = x+10;
        return result;
    }
    public static String Character (String  x) //formal parameter
    {
        x = "qqqq";
        String Cresult = x; 
        return Cresult; 
    }
    public double Double (double c)
    { 
        return c;
    }
    public static int Casting (int d)
    {
        d = 10;
        return d;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        EarthMethod Kuy = new EarthMethod();

        // Pointerinjava SDD = new Pointerinjava(); Object Oriented Programming
        

        int a = sc.nextInt(); 
        String  b = sc.next();
        int c = sc.nextInt();
        float d = sc.nextFloat();
        

        Kuy.Double(c); //Create Object


        System.out.println(("test = " + test(a))); // actual parameter 
        System.out.println("Character = " + Character(b)); //actual parameter
        System.out.println("Double = "+ Kuy.Double(c));
        System.out.println(Casting((int)d));
    }
}
