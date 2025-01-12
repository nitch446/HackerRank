package HackerRank_Ex_004;
import java.util.Scanner;
public class Reading_input_Until_EOF_in_Java {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while(scanner.hasNextLine())
        {
          String line = scanner.nextLine();
          System.out.println(lineNumber+" "+line);

          lineNumber++;
        }
        scanner.close();
    }
}


/*
  Input:

  Hello world
  I am a file
  Read me until end-of-file.


  Output:

  1 Hello world
  2 I am a file
  3 Read me until end-of-file.

*/