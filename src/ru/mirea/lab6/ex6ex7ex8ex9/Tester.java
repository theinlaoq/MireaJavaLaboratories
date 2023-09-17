package ru.mirea.lab6.ex6ex7ex8ex9;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        Printable[] arr = new Printable[3];

        arr[0] = new Book("Book one", "Lorem ipsum");
        arr[1] = new Magazine("Magazine one", LocalDate.now(), "Ipsum lorem");
        arr[2] = new Book("Book 2", "Ipsussim aj");

        for(Printable pr : arr){
            pr.print();
        }
    }
}
