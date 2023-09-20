package ru.mirea.lab2.ex7;

import java.util.Arrays;

public class Book {
    private String author;
    private String name;
    private int year;
    private String genre;

    public Book(String author, String name, int year, String genre) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}

class BookTest{
    public static void main(String[] args) {
        Book b1 = new Book("mrs Anni", "gari poter", 2004, "fantasy");
        System.out.println(b1);
        b1.setAuthor("mr anonim");
        b1.setName("xxx");
        b1.setYear(1998);
        b1.setGenre("Documentary");
        System.out.println(b1.getAuthor() + " " + b1.getName()
                + " " + b1.getYear() + " " + b1.getGenre());
        ////////////////////////////
        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = new Book("sda", "kls", 1635, "none");
        books[2] = new Book("adfasd", "jdkd", 2020, "klawe");
        books[3] = new Book("nian", "kldsssag", 1915, "jiops");
        Bookshelf bookshelf = new Bookshelf(books);
        System.out.println(bookshelf);
        System.out.println(bookshelf.getNewestBook());
        System.out.println(bookshelf.getOldestBook());
        bookshelf.sortByAscOrd();
        System.out.println(bookshelf);


    }
}


class Bookshelf{
    private Book[] books;
    private int countBooks;

    public Bookshelf(Book[] books) {
        this.books = books;
        this.countBooks = books.length;
    }

    public Book getOldestBook(){
        int index = 0;
        int oldest = 1000000;
        for(int i = 0; i < books.length; i++){
            if(books[i].getYear() < oldest){
                oldest = books[i].getYear();
                index = i;
            }
        }
        return books[index];
    }

    public Book getNewestBook(){
        int index = 0;
        int newest = 0;
        for(int i = 0; i < books.length; i++){
            if(books[i].getYear() > newest){
                newest = books[i].getYear();
                index = i;
            }
        }
        return books[index];
    }

    public void sortByAscOrd(){
        for(int i = 0; i < countBooks; i++){
            for(int j = 1; j < countBooks - i; j++){
                if(books[j - 1].getYear()>books[j].getYear()){
                    Book temp = books[j - 1];
                    books[j - 1] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + Arrays.toString(books) +
                ", countBooks=" + countBooks +
                '}';
    }
}