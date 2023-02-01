/*
알파벳 찾기

문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 
단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

예제 입력 1 
baekjoon

예제 출력 1 
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */

package baekjoon_230117;

import java.util.Arrays;
import java.util.Scanner;

public class No10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		String[] abc = new String[26];
		int[] answer = new int[26];
		
		for(int i = 0; i < abc.length; i++) {
			abc[i] = String.valueOf((char)(97 + i));
			// 아스키코드를 이용하여 알파벳 배열 생성
		}
		
		String[] s = new String[S.length()];
		for(int i = 0; i < S.length(); i++) {	
			s[i] = String.valueOf(S.charAt(i));
		}
		
		for(int i = 0; i < 26; i++) {
			answer[i] = -1; // 배열의 값을 -1로 초기화
			
			for(int j = 0; j < s.length; j++) {
				
				if(abc[i].equals(s[j])) {
					answer[i] = Arrays.asList(s).indexOf(abc[i]);
					// 배열을 목록화 시켜주기위해 Arrays.asList 사용 -> ArrayList로 변환
				} 
				
			}
			
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		
	}

}
