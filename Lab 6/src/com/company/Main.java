package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Person Kate=new Person("Kate",30);
        Person Bob=new Person();
        Kate.Fullname="Екатерина";
        Kate.age=30;
        Kate.info();
        Bob.Fullname="Bob";
        Bob.age=18;
        Bob.info();
    }
}
class Person {
    String Fullname;
    int age;
    Person() {
        this.Fullname = Fullname;
        this.age = age;
    }
    Person(String Fullname, int age) {
        this.Fullname = Fullname;
        this.age = age;

    }

    public void info() {
        System.out.println(Fullname);
        System.out.println(age);
    }

    void move() {
        System.out.println(this.Fullname + "Speaking");

    }

    void talk() {
        System.out.println(this.Fullname + "Speaking");
    }

}
