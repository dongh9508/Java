package org.opentutorials.javatutorials.condition;

public class LoginDemo {
    public static void main(String[] args) {
        String id = args[0];
        if(id.equals("egoing")) {
            System.out.println("rigth");
        } else {
            System.out.println("wrong");
        }
    }
}
