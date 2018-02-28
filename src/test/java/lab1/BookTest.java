package lab1;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        BookTest at = new BookTest();
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        int index = 0;

        Book[] newBooks;
        newBooks = new Book[5];

        while (flag) {

            System.out.println("Welcome, please enter the command you would like to perform:");
            String raw = scan.nextLine();

            if (raw.toLowerCase().equals("Exit")) {
                flag = false;
            } else if (raw.toLowerCase().equals("Create")) {
                System.out.println("Please enter the book's ISBN:");
                String ISBN = scan.nextLine();

                System.out.println("Please enter the book's Author:");
                String Author = scan.nextLine();

                System.out.println("Please enter the book's Title:");
                String Title = scan.nextLine();

                System.out.println("Please enter the book's Excerpt:");
                String Excerpt = scan.nextLine();

                Book newBook = new Book(ISBN, Author, Title, Excerpt);
                newBooks[index] = newBook;
                index++;


            } else if (raw.toLowerCase().equals("getInfo")) {
                at.getInfo;
            }
        }
    }
}
