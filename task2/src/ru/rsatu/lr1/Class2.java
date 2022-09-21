package ru.rsatu.lr1;

import ru.rsatu.lr1.Class1;

public class Class2 {
    public static void main(String[] args) {
        Class1.staticPrint("Static World");

        Class1 class1 = new Class1();
        class1.print("Test World");
    }
}