package ro.siit.homework3;

import java.util.*;

public class Main {

    public static void hello(String name) {
        // write your code here

        if(name.equals(""))
            System.out.println("Hello, stranger!");
        else {
            System.out.println("Hello, " + name +"!");
        }
    }
    public static void main(String[] args) {
        String start = "Please tell us your name :) ";
        System.out.println(start);

        Scanner sc = new Scanner(System.in); //scanner as object
        String name = sc.nextLine();
        hello(name);
    }
}
