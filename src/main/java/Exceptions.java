import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

    private static final String FILENAME = "C:\\GitJava\\JavaUpskill\\src\\input.txt";

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            processFile(reader);
            performCalculation();


            }
        catch(FileNotFoundException e){
            System.out.print("File not found");
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.print("Stack Trace: ");
            String message = e.getMessage();
            e.printStackTrace();
        } catch(Exception e){
            System.out.print("Final exception: ");
            System.out.println(e.getMessage());
        }

    }
    private static void processFile(BufferedReader reader) throws IOException {
        String currentLine = null;
        while (true) {
            try {
                if ((currentLine = reader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(currentLine);
        }

    }

    private static void performCalculation() throws ArithmeticException{
        int result = 0;
        int a = 1;
        int b = 1;
        try{
            result = a / (b - 1);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(result);
    }

}

