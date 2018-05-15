//Given two strings, write a method to decide if one is a permutation of the other
import java.util.*;
public class questionTwo{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		String one = sc.nextLine();
		String two = sc.nextLine();
		boolean res = isPermutation(one, two);
		if (res == false){
            System.out.println("The two words are not permutations");
        }else
            System.out.println("The two words are permutations");

	}

	public static boolean isPermutation(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        else{
           char []str1 = s1.toCharArray();
           char []str2 = s2.toCharArray();
           Arrays.sort(str1);
           Arrays.sort(str2);
           for (int x = 0; x < str1.length; x++){
               if(str1[x] != str2[x]){
                   return false;
               }
           }
           return true;
        }
    }
    
}