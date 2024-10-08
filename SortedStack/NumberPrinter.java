
// NumberPrinter.java
import java.util.List;
import java.util.Stack;

/**
 * The NumberPrinter class is responsible for printing a list or stack of integers to the console.
 */
public class NumberPrinter 
{
    /**
     * Prints the provided list of numbers to the console.
     * 
     * @param numbers the list of integers to be printed
     */
    public void printNumbers(List<Integer> numbers) 
    {
        System.out.println("Numbers in List: " + numbers);
    }

     /**
     * Prints the provided stack of numbers to the console.
     * 
     * @param numbers the stack of integers to be printed
     */
    public void printNumbers(Stack<Integer> numbers) 
    {
        System.out.println("Numbers in Stack: " + numbers);
    }


}