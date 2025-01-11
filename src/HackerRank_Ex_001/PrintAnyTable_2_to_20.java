package HackerRank_Ex_001;

import java.util.Scanner;

public class PrintAnyTable_2_to_20 {
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        int N = scr.nextInt();

        if(N>=2 && N<=20)
        {
          for(int i=1; i<=10; i++)
          {
              System.out.println(N+" x "+i+" = "+(N*i));
          }
        }
    }
}
