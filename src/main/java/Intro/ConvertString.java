package Intro;

import java.security.Permission;
import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {


        try{
            Scanner scanner = new Scanner(System.in);
            int inputInt = scanner.nextInt();
            scanner.close();
            String textFromInt = String.valueOf(inputInt);
            if (inputInt == Integer.parseInt(textFromInt)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
        System.out.println("Unsuccessful Termination!!");
    } catch (Exception e){
            System.out.println("Error");
        }

    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

