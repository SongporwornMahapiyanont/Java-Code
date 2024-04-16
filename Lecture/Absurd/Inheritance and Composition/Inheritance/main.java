package Inheritance;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "KUY";
        double HP = scan.nextDouble();
        double MP = scan.nextDouble();
        double Def = scan.nextDouble();
        double str = scan.nextDouble();
        double dex = scan.nextDouble();
        double spd = scan.nextDouble();
        double horny = scan.nextDouble();


        Earth e = new Earth(name, HP, MP, Def, str, dex, spd,horny);
        e.printlnfo();
    }
}
