import java.util.*;

class questionFour{
	public static void main(String[]args){
		String s = "Hello";
		String s2 = "Oxo";
		String s3 = "Hello World";
		String s4 = "Hann nnaH";
		String result = isPallindrome(s);
		String result2 = isPallindrome(s2);
		String result3 = isPallindrome(s3);
		String result4 = isPallindrome(s4);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

	public static String isPallindrome(String s){
		String newString = "";
		//reverse the string and put into a new string
		for(int x = s.length()-1; x >= 0; x--){
			newString += s.charAt(x);
		}
		//change both strings to lower case
		s = s.toLowerCase();
		newString = newString.toLowerCase();
		//compare the two strings
		for(int x =  0; x < s.length(); x++){
			if(s.charAt(x) == newString.charAt(x)){
				continue;
			}else{
				return "false";
			}
		}
		return "true";
		
	}
}