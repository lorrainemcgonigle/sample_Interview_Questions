//compress a string, eg aaabccabbbbcc becomes a3b1c2a1b4c2. If the original string is shorter return the original string
import java.util.*;

class questionSix{
	public static void main(String[]args){
		String sentence = "aaabbbcccddd";
		System.out.println(compressString(sentence));//a3b3c3d3
	}

	public static String compressString(String s){
		String newWord = "";
		int count = 0;
		for(int x = 0; x < s.length(); x++){
			count ++;
			if((x+1 >= s.length()) || (s.charAt(x) != s.charAt(x+1))){
				newWord += s.charAt(x) + "" + count;
				count = 0;
			}
		}
		return s.length() < newWord.length() ? s : newWord;
	}
}