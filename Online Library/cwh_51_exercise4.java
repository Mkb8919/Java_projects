package com.company;

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;

    }

   public void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    public void showAvailableBooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);

        }
    }

   public void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
        }

     public void returnBook(String book){
        addBook(book);
         System.out.println("The book wil be returned...");

     }
    }

    public class cwh_51_exercise4 {
        public static void main(String[] args) {
//        you have to implement a library using java class library
//        methods: addBook, issuesBook, returnBook, showAvailableBooks
//       properties: Array to store the available books,
//       array to store the issued books

            Library centralLibrary = new Library();
            centralLibrary.addBook("Think and grow Rich");
            centralLibrary.addBook("Pride and Prejudice");
            centralLibrary.addBook("A Tree Grows in Brooklyn");
            centralLibrary.addBook("Algorithms");
            centralLibrary.showAvailableBooks();

            centralLibrary.issueBook("Algorithms");
            centralLibrary.showAvailableBooks();

            centralLibrary.returnBook("Algorithms");
            centralLibrary.showAvailableBooks();
        }
    }

