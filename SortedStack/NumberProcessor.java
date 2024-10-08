// Aaron Milam
// CSC 6301
// Week 5 programming assignment
// NumberProcessor.java


import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * The NumberProcessor class orchestrates the process of receiving, sorting, and printing numbers.
 * It utilizes instances of NumberInput, NumberSorter, and NumberPrinter to achieve its functionality.
 */
public class NumberProcessor 
{
    private final NumberInput inputHandler; // Handles user input for numbers
    private final NumberSorter sorter; // Sorts the list of numbers
    private final NumberPrinter printer; // Prints the sorted list of numbers

    /**
     * Constructs an instance of NumberProcessor, initializing the input handler, sorter, and printer.
     */
    public NumberProcessor() 
    {
        this.inputHandler = new NumberInput();
        this.sorter = new NumberSorter();
        this.printer = new NumberPrinter();
    }

    /**
     * Processes numbers by receiving user input, sorting the numbers, 
     * and printing the sorted numbers to the console.
     */
    public void processNumbers() 
    {
        // Using try-with-resources to ensure the Scanner is closed after use
        try (Scanner scanner = new Scanner(System.in)) 
        {

            // Receive a list of integers from the user
            List<Integer> numbers = inputHandler.receiveUserInput(scanner);

            printer.printNumbers(numbers);
            // Sort the received numbers
            sorter.sortNumbers(numbers);
            // Print the sorted numbers
            printer.printNumbers(numbers);

            Stack<Integer> sortedStack = inputHandler.addToStack(numbers);

            // Print the sorted stack of numbers
            printer.printNumbers(sortedStack);

            
        }
    }

    /**
     * The main method serves as the entry point of the application.
     * It creates a NumberProcessor instance and initiates the processing of numbers.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) 
    {
        NumberProcessor processor = new NumberProcessor();
        processor.processNumbers();
    }
}