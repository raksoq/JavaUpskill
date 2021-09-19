import java.util.HashMap;
import java.util.Scanner;

public class PhoneMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        String name;
        int phoneNumber;

        System.out.println("Number of entries in the book: ");
        int numberOfEntries=scanner.nextInt();


        for(int i=0;i<numberOfEntries;i++)
        {
            name = scanner.next();
            phoneNumber = scanner.nextInt();
            phoneBook.put(name, phoneNumber);
//            phoneBook.put(scanner.next(), scanner.nextInt());
        }

        System.out.println("Enter " + phoneBook.size() + " name/names to check in phone book: ");
        for(int z=1; z<=phoneBook.size() ;z++)
        {
            name = scanner.next();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            }
            else{
                System.out.println("Not found");
            }
        }


    }
}
