/*
두 수의 차

문제 설명
정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

제한사항
-50000 ≤ num1 ≤ 50000
-50000 ≤ num2 ≤ 50000

입출력 예
num1	num2	result
2		3		-1
100		2		98

입출력 예 설명

입출력 예 #1
num1이 2이고 num2가 3이므로 2 - 3 = -1을 return합니다.

입출력 예 #2
num1이 100이고 num2가 2이므로 100 - 2 = 98을 return합니다.
 */

package level_0;

public class Training_01_221225 {

	public static void main(String[] args) {
		Minus minus = new Minus();
		
		int num1_1 = 2;
		int num1_2 = 100;
		
		int num2_1 = 3;
		int num2_2 = 2;
		
		System.out.println(minus.solution(num1_1, num2_1));
		System.out.println(minus.solution(num1_2, num2_2));
	}
}

class Minus {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(-50000 <= num1 && num1 <= 50000) {
            if(-50000 <= num2 && num2 <= 50000) {
                answer = num1 - num2;
            }
        }
        
        return answer;
    }
}