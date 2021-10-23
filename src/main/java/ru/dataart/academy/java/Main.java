package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
//        ClassLoader classLoader = Main.class.getClassLoader();
//        System.out.println(classLoader.getResource("C:\\Users\\user\\Desktop\\vrn-java-06\\src\\test\\resources\\test.zip").getPath());
        Calculator calculator = new Calculator();
        System.out.println("Calculator get number of 1: " +
                calculator.getNumberOfChar("C:\\Users\\user\\Desktop\\vrn-java-06\\src\\test\\resources\\test.zip", '1'));

        System.out.println("Calculator get max length: " +
                calculator.getMaxWordLength("some_path\\test1.zip"));
    }
}