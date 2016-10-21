import java.util.*;
public class Task3_vowelsAndConsonants
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a phrase ");
        String phrase = input.nextLine();
        
        int NumOfV = 0;
        int NumOfC = 0;
        
        for (int i =0; i < phrase.length();i++)
        {
            phrase = phrase.toLowerCase();
            //System.out.println(i);
            if (phrase.substring(i,i+1).equals("a") || phrase.substring(i,i+1).equals("e") || phrase.substring(i,i+1).equals("i") || phrase.substring(i,i+1).equals("o") || phrase.substring(i,i+1).equals("u"))
            {
                NumOfV++;
            } else{
                NumOfC++;
                System.out.println(phrase.substring(i,i+1));
            }
        }
        //System.out.println(phrase);
        
        System.out.println("The phrase you entered has " + NumOfC + " consonants and " + NumOfV + " Vowels.");
    }
}