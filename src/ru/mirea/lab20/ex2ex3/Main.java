package ru.mirea.lab20.ex2ex3;

import ru.mirea.lab20.ex1.TripleGenericClass;
import ru.mirea.lab6.ex3.Animal;

public class Main {
    public static void main(String[] args) {
        Integer integerVar = 10;
        Animal catVar = new Animal("Fluffy");
        String stringVar = "Hello";

        TripleGenericClass<Integer, Animal, String> triple = new TripleGenericClass<>(integerVar, catVar, stringVar);
        triple.printClassNames();
    }
}
