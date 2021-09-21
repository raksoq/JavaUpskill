import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFactorial;
        int result = 1;

        System.out.println("Enter factorial n number: ");
        numberFactorial = scanner.nextInt();
        if(numberFactorial >=2 && numberFactorial <=12) {
            result = Calculate(numberFactorial);
        }

        System.out.println("Result of factorial " + numberFactorial + " is: " + result);
    }
    
    public static int Calculate(int n){
        if(n <= 0){
            return 1;
        }else{
            return n * Calculate(n - 1);
        }
    }
}
