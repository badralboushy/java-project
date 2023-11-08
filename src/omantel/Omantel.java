package omantel;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Omantel {

    public static void main(String[] args) throws IOException {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        String number, name;
        String choice="1" ;
        do {
            System.out.println("Enter a number");
            System.out.println("Enter '1' to Add a phone Number");
            System.out.println("Enter '2' to Delet a phone Number");
            System.out.println("Enter '3' to Search a phone Number");
            System.out.println("Enter '4' to Display all phone Number");
            System.out.println("Enter '5' to Quit");

            // = (new DataInputStream(System.in)).readLine();
             System.out.print(choice);
            switch (choice) {
                case "1":
                    System.out.println("Enter a number to add");
                    number = scanner.next();
                    System.out.println("Enter a name to add");
                    name = scanner.next();
                    LinkedList.insert(list, number, name);
                    break;

                case "2":
                    System.out.println("Enter a number to delete");
                    number = scanner.next();
                    LinkedList.deleteByNumber(list, number);
                    break;

                case "3":
                    System.out.println("Enter a number to search");
                    number = scanner.next();
                    LinkedList.searchByNumber(list, number);
                    break;

                case "4":
                    System.out.println("your list contain");
                    LinkedList.printList(list);
                    break;

                case "5":
                    break;
            }

        } while (choice != "5");

    }

}
