package com.company;

import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }
    public String toString(){
        return "Book{" +
                "name=" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    public ArrayList<Book>books;
    public MyLibrary(ArrayList<Book>books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("This book has been added to the Library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("This book has been issued from the Library" + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}

public class cwh_104_ex7 {
    public static void main(String[] args) {
        /*
        Create a library management system which is capable of issuing books to the students
         book should have info like :
         1. book name
         2. book author
         3. issued to
         4. issued on
         user should be able to add books, return issued books, issue books
         assume that all the users are registered with their names in the central database
        */

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithms", "CLRS");
        bk.add(b1);
        Book b2 = new Book("Algorithms", "CLRS");
        bk.add(b2);
        Book b3 = new Book("Algorithms", "CLRS");
        bk.add(b3);
        Book b4 = new Book("Algorithms", "CLRS");
        bk.add(b4);

        MyLibrary  l = new MyLibrary(bk);
        l.addBook(new Book("algo4", "myAuthor"));
        System.out.println(l.books);
        l.issueBook(b3, " Mohit");
        System.out.println(l.books);

    }
}
