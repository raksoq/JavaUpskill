import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Math.pow;

public class PhoneMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        String name;
        String numberString;
        int phoneNumber;
        int counter = 0;

        System.out.println("Number of entries in the book: ");
        int numberOfEntries=scanner.nextInt();

        if (numberOfEntries <= pow(10,5)) {

            for (int i = 0; i < numberOfEntries; i++) {
                name = scanner.next();
                phoneNumber = scanner.nextInt();
                numberString = Integer.toString(phoneNumber);
                if (numberString.chars().count() > 8) {
                    phoneNumber = Integer.parseInt(numberString.substring(0, 8));
                }
                phoneBook.put(name, phoneNumber);
//            phoneBook.put(scanner.next(), scanner.nextInt());
            }

            System.out.println("[Size = "+ phoneBook.size() + " ]Enter name/names to check in phone book: ");
            while(scanner.hasNext() && counter <= pow(10,5)){
                name = scanner.next();
                if (phoneBook.containsKey(name)) {
                    System.out.println(name + "=" + phoneBook.get(name));
                } else {
                    System.out.println("Not found");
                }
            }
        }


    }
}
