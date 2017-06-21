package substrings;

import java.util.Scanner;

/**
 *
 * @author Adhiambo oyier
 */
public class SubStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter word to check if it's a palindrome");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String newWord = "";
        String[] letters = word.split("");
       
        for(int i = word.length()-1; i>=0; i--){
            newWord += letters [i];
        }
        if(newWord.toLowerCase().equals(word)){
        System.out.println( word + " " + "is a palindrome");
        }
        else{
            System.out.println( word + " " + "is not a palindrome");
        }
    }
    
}
