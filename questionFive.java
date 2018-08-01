//Given two strings , check if they have been edited 0 or 1 times
import java.util.*;
class questionFive{
	public static void main(String[]args){
		String s1 = "hello";
		String s2 = "hello";
		int result = isEdited(s1, s2);
		if(result == 0)
			System.out.println("No changes made");
		else if(result == 1)
			System.out.println("One change made");
		else
			System.out.println("More than one change made");

	}

	public static int isEdited(String s1, String s2){
		int counter = 0;
		//check if the two are still the same
		if(s1.equals(s2) ){
			return 0;
		//check if chars have been removed or added and check the remaining chars to see if edits have been made
		}else if(s1.length() != s2.length()){
			int returnLength = Math.abs(s1.length() - s2.length());
			for(int x = 0; x < s1.length() && x < s2.length(); x ++){
				if(s1.charAt(x) == s2.charAt(x)){
				}
				else{
					counter ++;
				}
			}
			return counter+returnLength;
		}
		//if still the same length just check the chars for changes
		else{
			for(int x = 0; x < s1.length() && x < s2.length(); x ++){
				if(s1.charAt(x) == s2.charAt(x)){
				}
				else{
					counter ++;
				}
			}

			return counter;
		}

	}
}