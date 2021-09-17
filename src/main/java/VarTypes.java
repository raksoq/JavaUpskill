import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;

public class VarTypes {

    void calculations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of test cases");
        int numberOfTestCases=sc.nextInt();


        for(int i=0;i<numberOfTestCases;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -pow(2,31) && x <= pow(2,31) - 1) {
                     System.out.println("* int");
                }
                if (x >= -pow(2,63) && x <= pow(2,63) - 1) {
                    System.out.println("* long");
                }else{
                System.out.println(x + " can't be fitted anywhere.");
            }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted* anywhere.");
            }

        }
    }


}
