//Implement an algorithm to determine if a string has all unique characters
import java.util.*;
public class questionOne{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
        boolean result = check(input);
        if (result == false){
            System.out.println("Not Unique");
        }
        else
            System.out.println("Unique");
	}

	public static boolean check(String str){
        for (int x = 0; x < str.length(); x++){
            for (int y = x+1; y < str.length(); y++){
                if (str.charAt(x) == str.charAt(y)){
                    return false;
                }
            }
        }
        return true;
    }
}