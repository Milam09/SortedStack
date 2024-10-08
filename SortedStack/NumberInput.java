// NumberInput.java
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;

/**
 * The NumberInput class is responsible for receiving a list of integers from user input.
 * It uses a Stack to store the input numbers.
 */
public class NumberInput 
{
    /**
     * Receives a list of integers from the user via the Scanner.
     * Prompts the user for input and handles invalid entries.
     * Numbers are accepted from user into a List, then  pushed into a Stack after sorting
     * 
     * @param scanner the Scanner used to receive user input
     * @return a list of integers entered by the user
     */
    public List<Integer> receiveUserInput(Scanner scanner) 
    {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter integers separated by spaces, then press Enter:");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");

        // Parse the user input into integers
        for (String numStr : numberStrings) 
        {
            try 
            {
                int num = Integer.parseInt(numStr);
                numbers.add(num);
            } 
            catch (NumberFormatException e) 
            {
                // Inform the user about invalid input and continue processing
                System.out.println("Skipping invalid number: " + numStr);
            }
        }
        return numbers;
    }
    
    /**
     * Adds the sorted list of integers into a Stack.
     * 
     * @param sortedNumbers the sorted list of integers
     * @return a stack of sorted integers
     */
    public Stack<Integer> addToStack(List<Integer> sortedNumbers) 
    {
        Stack<Integer> numberStack = new Stack<>();

        // Push the sorted numbers into the stack
        for (int num : sortedNumbers) 
        {
            numberStack.push(num);
        }

        return numberStack;
    }



}