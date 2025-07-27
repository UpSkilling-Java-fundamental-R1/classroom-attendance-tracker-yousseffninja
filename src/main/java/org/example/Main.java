package main.java.org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> signIns = new ArrayList<>();
        ArrayList<String> uniqueStudents = new ArrayList<>();

        System.out.println("Enter student names (type \"done\" to finish):");
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            if (!input.isEmpty()) {
                signIns.add(input);
            }
        }

        for (String name : signIns) {
            if (!uniqueStudents.contains(name)) {
                uniqueStudents.add(name);
            }
        }

        Collections.sort(uniqueStudents);

        System.out.println("Total sign-ins: " + signIns.size());
        System.out.println("Unique students: " + uniqueStudents.size());
        System.out.println("Attendance list: " + uniqueStudents);
    }
}
