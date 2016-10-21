
import java.util.*;
public class LearningHowToUseArrays
{
    public static void main (String[] args)
    {
        int numberOne = 1; // setting variables
        int numberTwo = 2;
        
        ArrayList numbers = new ArrayList( ); // creating a new array list
        System.out.println(numbers.size()); // printing out how many strings the list contains
        numbers.add (numberOne); //adding the variables to the list
        numbers.add (numberTwo);
        System.out.println(numbers.size()); // printing out how many strings the list contains
        
        System.out.println(numbers.get(0)); // printing out the first variable of the list
    }
}
