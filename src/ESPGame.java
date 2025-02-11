/*
 * Class: CMSC203 CRN 31274
 	Program: Assignment 1
 	Instructor: Professor Ahmed Tarek
 	Summary of Description: Develop a game that tests a user’s Extrasensory perception(ESP)
 	Due Date: 02/04/2025 
 	Integrity Pledge: I pledge that I have completed the programming assignment independently. 
 					  I have not copied the code from a student or any source.
 					  I have not given my code to any student.
		Fsihatsion A.Ambelu(Finn)

 * Platform/compiler: Eclipse
*/


import java.io.*;
import java.util.*;

public class ESPGame {
    public static void main(String[] args) {
    	final String FILE_NAME = "C:/Users/Fsihatsion Argaw/eclipse-workspace/ESPGame/colors.txt";
        final String OUTPUT_FILE = "C:/Users/Fsihatsion Argaw/eclipse-workspace/ESPGame/EspGameResults.txt";
        final String PROGRAMMER_NAME = "Fsihatsion A.Ambelu(Finn)";
        final String DESCRIPTION = "I am a CMSC203 student with a major in Computer Science";
        final int TOTAL_ROUNDS = 3;
        final int MAX_COLORS = 16;
        final int OPTION_16_COLORS = 16;
        final int OPTION_10_COLORS = 10;
        final int OPTION_5_COLORS = 5;
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        int correctGuesses = 0; // Moved declaration outside the loop
        
        while (playAgain) {
            correctGuesses = 0; // Reset for each game session
            
            System.out.println("\nWelcome to ESP - Extrasensory Perception Game!");
            System.out.println("Choose one of the following options:");
            System.out.println("1 - Display the first 16 colors from colors.txt");
            System.out.println("2 - Display the first 10 colors from colors.txt");
            System.out.println("3 - Display the first 5 colors from colors.txt");
            System.out.println("4 - Exit the program");
            
            int choice = 0;
            while (choice < 1 || choice > 4) {
                System.out.print("\nEnter your choice (1-4): ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                }
                scanner.nextLine(); // Clear buffer
            }
            
            if (choice == 4) {
                System.out.println("\nExiting the program. Goodbye!");
                break;
            }
            
            String[] colors = new String[MAX_COLORS];
            int colorCount = 0;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
                String line;
                while ((line = reader.readLine()) != null && colorCount < MAX_COLORS) {
                    colors[colorCount] = line.trim();
                    colorCount++;
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + FILE_NAME);
                continue;
            }
            
            int numColors = (choice == 1) ? OPTION_16_COLORS : (choice == 2) ? OPTION_10_COLORS : OPTION_5_COLORS;
            
            if (colorCount < numColors) {
                System.out.println("Error: Insufficient colors in the file.");
                continue;
            }
            
            System.out.println("\nHere are the available colors:");
            for (int i = 0; i < numColors; i++) {
                System.out.println((i + 1) + ". " + colors[i]);
            }
            
            for (int round = 1; round <= TOTAL_ROUNDS; round++) {
                System.out.println("\nRound " + round + ": I am thinking of a color.");
                int randomIndex = random.nextInt(numColors);
                String selectedColor = colors[randomIndex].toLowerCase();
                
                System.out.print("\nEnter your guess: ");
                String userGuess = scanner.nextLine().trim().toLowerCase();
                
                if (userGuess.equals(selectedColor)) {
                    System.out.println("\nCorrect! I was thinking of " + selectedColor + ".");
                    correctGuesses++;
                } else {
                    System.out.println("\nWrong! I was thinking of " + selectedColor + ".");
                }
            }
            
            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctGuesses + " out of " + TOTAL_ROUNDS + " correctly.");
            
            System.out.print("\nWould you like to play again? (Yes/No): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");
        }
        
        System.out.print("\nEnter your name: ");
        String userName = scanner.nextLine().trim();
        System.out.print("Describe yourself: ");
        String userDescription = scanner.nextLine().trim();
        System.out.print("Enter due date (MM/DD/YY): ");
        String dueDate = scanner.nextLine().trim();
        
        System.out.println("\nUser Information:");
        System.out.println("Username: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.println("Due Date: " + dueDate);
       
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE, true));
            writer.write("Game Over\nYou guessed " + correctGuesses + " out of " + TOTAL_ROUNDS + " correctly.\n");
            writer.write("Due Date: " + dueDate + "\nUsername: " + userName + "\nUser Description: " + userDescription + "\n");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + OUTPUT_FILE);
        }
        
        System.out.println("\nThank you for playing! Your results have been saved.");
        
        System.out.println("Programmer: " + PROGRAMMER_NAME );
        System.out.println("About: " + DESCRIPTION);
        scanner.close();
    }
}


