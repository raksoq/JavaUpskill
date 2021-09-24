package ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Integer to be converted: ");
        int n = Integer.parseInt(reader.readLine().trim());
        int reminder;
        int counter = 0;
        int max = 0;


        while(n > 0){
            reminder = n%2;
            n = n/2;
            if (reminder == 1 ) {
                counter++;

            }else{
                counter = 0;
            }
            max = Math.max(counter,max);

            System.out.print(" reminder: " +reminder);
            System.out.print(" counter: " +counter);
            System.out.println(" n: " +n);

        }
        System.out.println(max);

        reader.close();

    }
}
