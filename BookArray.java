package homework5;

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        Book[] booksArray = new Book[10];

        while (index < 10) {
            System.out.println("Which book you wanna add ?");
            System.out.println("1)Fictional ");
            System.out.println("2)Non-Fictional ");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Add the name of your book :");
                String name = scanner.next();
                booksArray[index] = new Fiction(name);
                System.out.println();
            } else if (number == 2) {
                System.out.println("Add the name of your book :");
                String name = scanner.next();
                booksArray[index] = new NonFiction(name);
                System.out.println();
            } else {
                System.out.println(" the number in incorrect");
                System.out.println();
                continue;
            }

            index++;

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(booksArray[i].toString());
        }

    }
}
