package ru.rsatu.lr1;

public class Class1 {
	
    static String string1 = "Hello";
	
    public static void staticPrint(String name) {
        System.out.println(string1 + " " + name + "!");
    }

    public void print(String name) {
        System.out.println("Hello " + name + "!");
    }
}