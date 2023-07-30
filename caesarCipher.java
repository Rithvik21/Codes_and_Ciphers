//Name: Rithvik Padigala
//Period: 4A
import java.util.*;
public class caesarCipher
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        encrypt("hello", 5);
        decrypt("hello", 5);
    }
    //#3)
    public static String encrypt(String s, int key){
        char[] values = s.toCharArray();
        
        for(int i = 0; i <s.length(); i++){
            char letter = values[i];
            
            letter += key;
        }
        return new String(values);
    }
    public static String decrypt(String s, int key){
        char[] values = s.toCharArray();
        
        for(int i = 0; i <s.length(); i++){
            char letter = values[i];
            
            letter -= key;
        }
        return new String(values);
    }
}
