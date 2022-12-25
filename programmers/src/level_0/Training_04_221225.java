/*
몫 구하기

문제 설명
정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100

입출력 예
num1	num2	result
10		5		2
7		2		3

입출력 예 설명

입출력 예 #1
num1이 10, num2가 5이므로 10을 5로 나눈 몫 2를 return 합니다.

입출력 예 #2
num1이 7, num2가 2이므로 7을 2로 나눈 몫 3을 return 합니다.
 */

package level_0;

public class Training_04_221225 {

	public static void main(String[] args) {
		Division2 division2 = new Division2();
		
		int num1_1 = 10;
		int num1_2 = 7;
		
		int num2_1 = 5;
		int num2_2 = 2;
		
		System.out.println(division2.solution(num1_1, num2_1));
		System.out.println(division2.solution(num1_2, num2_2));
	}

}

class Division2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(0 < num1 && num1 <= 100) {
            if(0 < num2 && num2 <= 100) {
                answer = num1 / num2;
            }
        }
        return answer;
    }
}