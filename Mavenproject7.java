/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author mike
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        // Collect user details
        try (Scanner scanner = new Scanner(System.in)) {
            // Collect user details
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter your favorite place: ");
            String place = scanner.nextLine();
            
            System.out.print("Enter your dream occupation: ");
            String occupation = scanner.nextLine();
            
            System.out.print("Enter your best friend's name: ");
            String bestFriend = scanner.nextLine();
            
            System.out.print("Enter your favorite magical creature: ");
            String creature = scanner.nextLine();
            
            // Generate the story
            String story = "Once upon a time, in a faraway land called " + place + ", there lived a brave soul named " + name + ". " +
                    "At just " + age + " years old, " + name + " had a dream—to become a " + occupation + ". " +
                    "One day, while exploring the enchanted forests of " + place + ", " + name + " stumbled upon a mysterious cave. " +
                    "Inside, a glowing " + creature + " appeared and spoke in a melodious voice.\n\n\"Dear " + name + ", I have been expecting you. Your destiny is to bring harmony to this land.\" " +
                    "With courage and determination, " + name + " and their best friend, " + bestFriend + ", embarked on an unforgettable adventure, " +
                    "discovering hidden secrets, overcoming great challenges, and ultimately shaping the fate of " + place + " forever.\n\n" +
                    "And so, " + name + "'s legend was written in the stars, remembered for generations to come.";
            
            // Display the story
            System.out.println("\nHere is your story:\n");
            System.out.println(story);
        }
    }
}
