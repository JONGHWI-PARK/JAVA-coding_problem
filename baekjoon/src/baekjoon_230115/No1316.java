/*
그룹 단어 체커

문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

예제 입력 1 
3
happy
new
year

예제 출력 1 
3
--------------
예제 입력 2 
4
aba
abab
abcabc
a

예제 출력 2 
1
--------------
예제 입력 3 
5
ab
aa
aca
ba
bb

예제 출력 3 
4
--------------
예제 입력 4 
2
yzyzy
zyzyz

예제 출력 4 
0
--------------
예제 입력 5 
1
z

예제 출력 5 
1
 */

package baekjoon_230115;

import java.util.Scanner;

public class No1316 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] abcCheck = new int[26];
		String[] abc = new String[26];
		boolean isRight;
		
		for(int i = 0; i < 26; i++) {
			abcCheck[i] = 0;
			abc[i] = String.valueOf((char)(97 + i));
		}
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < 26; j++) {
				abcCheck[j] = 0;
			}
			
			String prev = "0";
			
			isRight = true;
			String alphabet = sc.next();
				
			for(int k = 0; k < alphabet.length(); k++) {
				
				String alpha = String.valueOf(alphabet.charAt(k));
				
				for(int j = 0; j < 26; j++) {
						
					if(abc[j].equals(alpha)) {
						
						if(!prev.equals(alpha)) {
							
							if(abcCheck[j] != 1) {
								abcCheck[j] = 1;
								prev = alpha; // 연속적으로 다른 문자일 경우
							} else {
								isRight = false;
								break; // 후에 같은 문자가 나올 경우
							}
							
						} else {
							continue; // 연속적으로 같은 문자가 나왔을 경우
						}
							
					}
					
				}
				if(isRight == false) {
					break;
				}
			}
			
			if(isRight) {
				count++;				
			}
		}
		System.out.println(count);
		
	}

}