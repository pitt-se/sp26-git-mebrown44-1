import java.util.*;

public class CommitCafe {

    private static String barista = "Margo"; // STUDENT_TODO_1A: Change name
    private static String baristaNickname = "Nadine";// STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;
    private static ArrayList<String> coffeeTypes = new ArrayList<String>();

    public static void brew(String drink) {
        cups++; // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        System.out.println("[Brew Report] " + barista + " brewed a cup of " + drink ".");
        // STUDENT_TODO_2B: Add a second brew-related improvement
        // Tracks different drinks that are made.
        boolean newType = true;

        for(int i = 0; i < coffeeTypes.size(); i++){
            if(drink.equals(coffeeTypes.get(i)))
                newType = false;
        }

        if(newType){
            coffeeTypes.add(drink);
        }
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}