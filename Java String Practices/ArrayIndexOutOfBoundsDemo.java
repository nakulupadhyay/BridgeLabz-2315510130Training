package Bridge_Labz;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names) {
        System.out.println("\n--- Generating Exception (No Handling) ---");
        System.out.println("Accessing index 5: " + names[5]); 
    }
    public static void handleException(String[] names) {
        System.out.println("\n--- Handling Exception with Try-Catch ---");
        try {
            System.out.println("Accessing index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues safely after handling the exception.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        handleException(names);

        sc.close();
    }
}

