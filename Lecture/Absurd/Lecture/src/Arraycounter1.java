import java.util.Scanner;

public class Arraycounter1 {
    public static int countArrayOdds(int []array){
        int count = 0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2!=0)
            {
                count+=1;
            }
        }
        return count ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []array = new int[N];
        for(int i=0;i<N;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(countArrayOdds(array));
    }
}
