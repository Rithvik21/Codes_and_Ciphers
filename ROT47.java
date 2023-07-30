//Name: Rithvik Padigala
//Period: 4A
import java.util.*;
public class ROT47
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        encrypt("hello");
        decrypt("hello");
    }
    //#2)
    public static String encrypt(String s){
        char[] values = s.toCharArray();
        
        for(int i = 0; i <s.length(); i++){
            char letter = values[i];
            
            if (letter >= '!' && letter <= '~') {
                if (letter > 'O') {
                    letter -= 47;
                } else {
                    letter += 47;
                }
            }
        }
        return new String(values);
    }
    public static String decrypt(String s){
        char[] values = s.toCharArray();
        
        for(int i = 0; i <s.length(); i++){
            char letter = values[i];
            
            if (letter >= '!' && letter <= '~') {
                if (letter > 'O') {
                    letter += 47;
                } else {
                    letter -= 47;
                }
            }
        }
        return new String(values);
    }
}
