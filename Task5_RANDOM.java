import java.util.*;
public class Task5_RANDOM
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String guess = "";
        while(!guess.equals("RANDOM")){
            System.out.println("Guess the six character word ");
            guess = input.nextLine();
            guess = guess.toUpperCase();
            System.out.println(Close(guess));
        
        }
    }
    
    
    public static String Close(String guess)
    {
        String result = "";
        //System.out.println(guess);
        for(int i=0; i<guess.length(); i++)
        {
            //System.out.println("test2");
            char letterchar = guess.charAt(i);
            String letter = Character.toString(letterchar);
            //System.out.println(letter);
            if(letter.equals("RANDOM".substring(i,i+1))){
                result += guess.substring(i,i+1);
            } else {
                result += "?";
            }
        }
        //System.out.println(result);
        return result;
    }
}