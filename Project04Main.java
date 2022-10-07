import java.util.Arrays;
import java.util.LinkedList;

/**
 * Main class for CSC6301 Module 04, Project 04. Responsible only for calling
 * methods from classes created for this assignment and displaying the final
 * output. This class assumes that 'UserPrompt.java' and 'SortedListMaker.java'
 * are in the same file-system folder as this class. 
 * 
 * @author Sam Crow - crows@merrimack.edu
 * @version 1.0.0
 * @since 9/26/2022
 */
public class Project04Main {
    /**
     * Main method for Project 04. Crates methods and calls objects in seperate
     * classes to fulfill the goals of the assignment. Look into associated
     * classes 'UserPrompt.java' and 'SortedListMaker.java' for implementation
     * details.
     * 
     * @param args - Default main method arguments (unused)
     */
    public static void main(String[] args) {
        Integer[] testArray = UserPrompt.getIntegerArray();

        LinkedList<Integer> testList;
        testList = SortedListMaker.makeFromIntegerArray(testArray);
        
        System.out.println("You input the following integers:");
        System.out.println(Arrays.toString(testArray));
        System.out.println("\nHere they are as a sorted linked list:");
        System.out.println(testList.toString());
    }
}
