//Name: Rithvik Padigala
//Period: 4A
import java.util.*;
public class ROT13
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        encrypt("hello");
        decrypt("hello");
    }
    //#1)
    public static String encrypt(String s){
        char[] letters = s.toCharArray();
        
        for(int i = 0; i <s.length(); i++){
            char letter = letters[i];
            
            if (letter >= 'a' && letter <= 'z') {
                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            } 
            else if (letter >= 'A' && letter <= 'Z') {
                if (letter > 'M') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            letters[i] = letter;
        }
        return new String(letters);
    }
    public static String decrypt(String s){
        char[] letters = s.toCharArray();
        
        for(int i = 0; i <s.length(); i++){
            char letter = letters[i];
            
            if (letter >= 'a' && letter <= 'z') {
                if (letter > 'm') {
                    letter += 13;
                } else {
                    letter -= 13;
                }
            } 
            else if (letter >= 'A' && letter <= 'Z') {
                if (letter > 'M') {
                    letter += 13;
                } else {
                    letter -= 13;
                }
            }
            letters[i] = letter;
        }
        return new String(letters);
    }
}
