package baekjoon_230202;

import java.util.Scanner;

public class No1259_ver02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			String palindromeNum = sc.nextLine();
			
			if(!String.valueOf(palindromeNum.charAt(0)).equals("0")) {
				
				char[] charArr = palindromeNum.toCharArray();			
				String reverseNum = "";
				
				for(int i = palindromeNum.length() - 1; i >= 0; i--) {
					reverseNum += charArr[i];
				}
				
				if(Integer.parseInt(palindromeNum) == Integer.parseInt(reverseNum)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			} else {
				break;
			}
			
		}

	}

}


/*
The code checks whether a given string is a palindrome or not, 
however, there are a few issues with the implementation:

1. The code does not handle the case where the input string starts with "0".
2. The code uses a string concatenation to build the reverse string, which can lead to performance issues for very large inputs.
3. The code does not consider leading and trailing spaces in the input string.

You may want to add additional checks and improvements to make the code more robust and efficient.
*/
