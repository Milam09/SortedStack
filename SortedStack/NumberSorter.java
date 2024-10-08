// NumberSorter.java
import java.util.List;
import java.util.Collections;

/**
 * The NumberSorter class is responsible for sorting a list of integers in ascending order.
 */
public class NumberSorter 
{
    /**
     * Sorts the provided list of integers in ascending order.
     * 
     * @param numbers the list of integers to be sorted
     */
    public void sortNumbers(List<Integer> numbers) 
    {
        Collections.sort(numbers);
    }
}