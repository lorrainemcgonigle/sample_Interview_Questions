//Replace the spaces in a string with %20
import java.util.*;
public class questionThree {

    public static void main(String[] args) {
        String sentence = "Mr John Smith";
        String finalString = replace(sentence);
        System.out.println(finalString);
        
    }
    
    public static String replace(String s){
        //create a char array from the string
        char[] sArray = s.toCharArray();
        for(int x = 0; x < sArray.length; x++){
            if(sArray[x] == ' '){
                sArray[x] = '%';
            }
        }
        //change it back to a string
        String newString = new String(sArray);
        String finalString = newString.replaceAll("%", "%20");
        return finalString;
    }
  }  
    
