// 1. import Scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's play MadLibs!");
        Scanner input = new Scanner(System.in);

        // Ask for the player’s name
        System.out.print("Enter your name: ");
        String player = input.nextLine();
        System.out.println("Welcome, " + player + "! Let's start.\n");

        // Prompt user for words
        System.out.print("Enter an emotion: ");
        String emotion = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective1 = input.nextLine();

        System.out.print("Enter a room in a house: ");
        String roomInHouse = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();

        System.out.print("Enter a dessert: ");
        String dessert = input.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = input.nextLine();

        System.out.print("Enter another noun: ");
        String noun3 = input.nextLine();

        System.out.print("Enter another noun: ");
        String noun4 = input.nextLine();

        System.out.print("Enter a musical instrument: ");
        String noun5 = input.nextLine();

        System.out.print("Enter a final adjective: ");
        String adjective3 = input.nextLine();

        // Print the completed story
        System.out.println("\nHere’s your MadLibs story!");
        System.out.println("I woke up feeling " + emotion + " today.");
        System.out.println("I walked into my house to the " + adjective1 + " smell of Christmas.");
        System.out.println("I walked into the " + roomInHouse + " to the smell of dinner.");
        System.out.println(noun1 + " were coming over for dinner.");
        System.out.println("We had so much " + noun2 + " together.");
        System.out.println("After dinner, we enjoyed fresh " + dessert + " and hot cocoa.");
        System.out.println("The night felt " + adjective2 + " as everyone laughed.");
        System.out.println("My " + noun3 + " kept barking at the guests.");
        System.out.println("A giant " + noun4 + " floated around the room and made us laugh.");
        System.out.println("Later, someone played the " + noun5 + " and we all sang along.");
        System.out.println("I went to bed feeling " + adjective3 + " and thankful for the day.");