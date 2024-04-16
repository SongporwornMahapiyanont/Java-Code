import java.util.Scanner;

public class Arraycounter2 {
    public static int countArrayOdds2(int[]array1 ,int[]array2)
    {
        int count = 0;
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]%2!=0)
            {
                count+=1;
            }
        }
        for(int i=0;i<array2.length;i++)
        {
            if(array2[i]%2!=0)
            {
                count+=1;
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int []array = new int[N1];
        for(int i=0;i<N1;i++)
        {
            array[i] = sc.nextInt();
        }
        int N2 = sc.nextInt();
        int []array2 = new int[N2];
        for(int i=0;i<N2;i++)
        {
            array2[i] = sc.nextInt();
        }
        System.out.println(countArrayOdds2(array, array2));

    }
}
