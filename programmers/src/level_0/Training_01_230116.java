/*
모음 제거

문제 설명
영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
my_string은 소문자와 공백으로 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 1,000

입출력 예
my_string					result
"bus"						"bs"
"nice to meet you"			"nc t mt y"

입출력 예 설명

입출력 예 #1
"bus"에서 모음 u를 제거한 "bs"를 return합니다.

입출력 예 #1
"nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를 return합니다.
 */

package level_0;

public class Training_01_230116 {

	public static void main(String[] args) {
		Vowel vo = new Vowel();
		
		String str1 = "bus";
		String str2 = "nice to meet you";
		
		System.out.println(vo.solution(str1));
		System.out.println(vo.solution(str2));
		
	}

}

class Vowel {
    public String solution(String my_string) {
        String answer = "";
        
        String vowel = "aeiou";
        
        for(char c : vowel.toCharArray()) {
            my_string = my_string.replace(String.valueOf(c), ""); // replace : 특정 문자 변환할 때 사용
        }
        answer = my_string;
        return answer;
    }
}