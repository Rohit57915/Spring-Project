package org.jsp.autowired_qualify_proj;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    private Scanner scanner;

    public void readInput() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);
    }
}
