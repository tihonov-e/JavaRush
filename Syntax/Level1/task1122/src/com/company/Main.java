package com.company;

//Затенение поля класса



public class Main {
    public static int salary;

    public static void add(int increase) {
        //int salary = Main.salary;
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
