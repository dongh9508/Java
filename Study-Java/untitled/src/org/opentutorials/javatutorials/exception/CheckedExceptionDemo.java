package org.opentutorials.javatutorials.exception;

import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);
    }
}
