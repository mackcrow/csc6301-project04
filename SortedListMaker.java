import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Provides methods for creating sorted LinkedList objects.
 * 
 * @author Sam Crow - crows@merrimack.edu
 * @version 1.0.0
 * @since 09/26/22
 */
public class SortedListMaker {
    
    /**
     * Creates a sorted LinkedList of Integer Objects from a given array of
     * Integer Objects.
     *  
     * @param array - Unsorted array of Integer objects
     * @return - LinkedList of Integer Objects, sorted in natural order.
     */
    public static LinkedList<Integer> makeFromIntegerArray(Integer[] array) {
        // Nothing to do with an empty or null argument.
        if (array.length == 0 || array == null) {
            return null;
        }

        // Prime the list
        LinkedList<Integer> returnList = new LinkedList<>();
        returnList.add(array[0]);

        // Build the sorted list
        ListIterator<Integer> iterator = returnList.listIterator();
        for (int i = 1; i < array.length; i++) {
            while (iterator.hasNext()) {
                Integer element = iterator.next();
                if (element.compareTo(array[i]) > 0) { // Find sorted slot
                    iterator.previous();
                    break; // inner loop
                }
            }
            iterator.add(array[i]);
            iterator = returnList.listIterator(); // Bring the pointer to start

        }

        return returnList;
    } 
}
