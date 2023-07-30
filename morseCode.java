//Name: Rithvik Padigala
//Period: 4A
import java.util.*;
public class morseCode
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        encrypt("hello");
        decrypt("hello");
    }
    //#3)
    public static String encrypt(String s){
        String s1 = s.toLowerCase();
        String newString = "";
        char[] values = s1.toCharArray();
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        
        for(int i = 0; i <s.length(); i++){
            char letter = values[i];
            if(letter == letters[i]){
                newString += morseCode[i];
            }
        }
        return newString;
    }
    public static String decrypt(String s){
        String s1 = s.toLowerCase();
        String newString = "";
        char[] values = s1.toCharArray();
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        
        for(int i = 0; i <s.length(); i++){
            char letter = values[i];
            if(letter == letters[i]){
                newString += morseCode[i];
            }
        }
        return newString;
    }
}
