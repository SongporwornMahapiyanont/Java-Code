package String;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1 = scan.next();
        char target = scan.next().charAt(0); // word for cut
        int start=0,stop=0;
        for(int i=0;i<text1.length();i++)
        {
            stop = text1.indexOf(target,start); // (letter for find , beginIndex)
            if(stop==-1)
            {
                System.out.println(text1.substring(start));
                break;
            }
            else
            {
                System.out.println(text1.substring(start, stop));
            }
            start = stop+1;
        }
    }
}
