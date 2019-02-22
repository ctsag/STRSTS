package gr.nothingness.STRSTS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleRunner {

    private List<String> goodStuff;
    private List<String> badStuff;

    private List<String> readInput(String message) {
        Scanner scanner = new Scanner(System.in);
        String input;
        List<String> entries = new ArrayList<>();

        System.out.println("\n");

        do {
            System.out.print(message + " or EOD to end input : ");
            input = scanner.nextLine();
            entries.add(input);
        } while (!input.equalsIgnoreCase("EOD"));

        entries.remove(entries.size() - 1);

        return entries;
    }

    private void printPost() {
        int i;

        System.out.println("\nGOOD STUFF\n-------");
        i = 1;
        for (String entry : goodStuff) {
            System.out.println(i + ". " + entry);
            i++;
        }

        System.out.println("\nBAD STUFF\n-------");
        i = 1;
        for (String entry : badStuff) {
            System.out.println(i + ". " + entry);
            i++;
        }
    }

    private ConsoleRunner() {
        goodStuff = this.readInput("Please enter some good stuff");
        badStuff = this.readInput("Please enter some bad stuff");
        this.printPost();
    }

    public static void main(String[] args) {
        new ConsoleRunner();
    }


}
