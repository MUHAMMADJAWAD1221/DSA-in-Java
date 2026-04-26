package DataStructures_Project;

import java.util.Stack;
import java.util.Scanner;

public class UndoRedoEditor {

    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        String text = "";
        int choice;

        do {
            System.out.println("\n----- TEXT EDITOR -----");
            System.out.println("Current Text:\n" + text);
            System.out.println("\n1. Add Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String newText = sc.nextLine();

                    undoStack.push(text);
                    if (text.isEmpty()) {
                        text = newText;
                    } else {
                        text += "\n" + newText;
                    }

                    redoStack.clear();
                    break;

                case 2:
                    if (!undoStack.isEmpty()) {
                        redoStack.push(text);
                        text = undoStack.pop();
                    } else {
                        System.out.println("Nothing to undo!");
                    }
                    break;

                case 3:
                    if (!redoStack.isEmpty()) {
                        undoStack.push(text);
                        text = redoStack.pop();
                    } else {
                        System.out.println("Nothing to redo!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}