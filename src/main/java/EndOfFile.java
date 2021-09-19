import java.util.Scanner;

public class EndOfFile {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read some unknown  lines of input from stdin(System.in) until you reach EOF;
         // each line of input contains a non-empty String.

         Scanner scan = new Scanner(System.in);
         for(int i = 1; scan.hasNext()== true; i++){
             System.out.println(i + " " + scan.nextLine());
         }

         scanner.close();
    }
}
