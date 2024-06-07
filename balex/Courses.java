package vu.balex;

import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        // Arrays to store course details
        String[] courseIDs = {"BSE", "BIT", "BCS", "BCE"};
        String[] courseNames = {"Software Engineering", "Information Technology", "Computer Science", "Computer Engineering"};
        int[] tuitions = {900000, 750000, 800000, 950000};

        // Variable to control the loop
        try ( // Creating a scanner to read input
                Scanner scanner = new Scanner(System.in)) {
            // Variable to control the loop
            boolean continueSearch = true;
            while (continueSearch) {
                // Prompt the user to enter the CourseID
                System.out.print("Enter the CourseID (or type 'quit' to exit): ");
                String enteredCourseID = scanner.nextLine();
                
                if (enteredCourseID.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                }
                
                // Initialize a flag to indicate if the CourseID was found
                boolean courseFound = false;
                
                // Search for the course details based on the entered CourseID
                for (int i = 0; i < courseIDs.length; i++) {
                    if (courseIDs[i].equalsIgnoreCase(enteredCourseID)) {
                        // If the CourseID is found, print the course details
                        System.out.println("Course Details:");
                        System.out.println("Course ID: " + courseIDs[i]);
                        System.out.println("Course Name: " + courseNames[i]);
                        System.out.println("Tuition: " + tuitions[i]);
                        System.out.println("-----------------------------");
                        courseFound = true;
                        break;
                    }
                }
                
                // If the CourseID was not found, print an error message
                if (!courseFound) {
                    System.out.println("Course ID not found. Please enter a valid Course ID.");
                }
            }
            // Close the scanner
        }
    }
}
