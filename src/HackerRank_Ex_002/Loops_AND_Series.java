package HackerRank_Ex_002;
import java.util.Scanner;

public class Loops_AND_Series {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i<q; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;

            for( int k = 0; k < n; k++)
            {
                sum+=b*(1<<k);

                System.out.print(sum+" ");
            }
            System.out.println();
        }

        in.close();
    }
}
