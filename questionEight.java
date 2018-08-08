//Write an algorithm such that if an element in a matrix is 0, it's rows and columns are set to 0

import java.util.*;
public class questionEight{
	public static void main(String[] args) {
		int [][] arr = new int[][]{{1, 2, 3}, {2, 3, 9}};
		boolean found = containsZero(arr);
		if(found == true){
			printChanged(arr);
		}else{
			System.out.println("Array did not contain zero");
		}
		
	}

	//Method to check if the array contains zero
	public static boolean containsZero(int [][] nums){
		boolean isFound = false;
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				if(nums[i][j] == 0){
						isFound = true;
					}
				}
			}
			return isFound;
		}

		//Method to change the elements to 0 and print
		public static void printChanged(int [][]nums){
			for(int i = 0; i < nums.length; i++){
				for(int j = 0; j < nums[0].length; j++){
					nums[i][j] = 0;
					System.out.print(nums[i][j]);
				}
				System.out.println("");
			}
		}
}