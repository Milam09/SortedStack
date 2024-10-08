# SortedStack
assigned implementation of a Sorted Stack

## Assigned Specifications and Description:

Assignment specifications are to: 
“Plan and execute a maintenance task to your last project (SortedLinkedList) adapting it to be now a Stack and not a LinkedList”. The function remains: Implement a program that reads a list of Integer numbers from the scanned input and saves them into a (Stack) sorted from the smallest to the largest. Be sure to use the Collections Framework and follow code guidelines and document your code accordingly.

The following changes were made to the original program:
Storing the user input: The initial program version stored the numbers into a Linked List. Now, the user’s input is stored initially in a List<Integer>. 
Sorting: Sorting continues to use the NumberSorter class on the List<Integer>. This only uses Collections.sort(). No changes made here.
Use of Stack: After the numbers are sorted, they are then pushed into a Stack. A new method addToStack was added to the NumberInput Class
Printing: NumberPrinter class was updated with an overloaded method printNumbers(Stack<Integer>) to allow it to print both lists and stacks. This allows it to keep output consistent with the original program design.

Other than these noted changes, this program is the same as SortedLinkedList.

The UML has been updated and included to help visualize created classes and methods and the relationships between them.

## Running Instructions
This code can be run from the command line with java NumberProcessor after compiling with: javac NumberInput.java NumberSorter.java NumberPrinter.java NumberProcessor.java

## Documentation Information
Generated JavaDoc folder is included. This documentation can also be generated withj: javadoc -d doc NumberInput.java NumberSorter.java NumberPrinter.java NumberProcessor.java
