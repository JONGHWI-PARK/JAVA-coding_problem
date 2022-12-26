/*
숫자 비교하기

문제 설명
정수 num1과 num2가 매개변수로 주어집니다. 
두 수가 같으면 1 다르면 -1을 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ num1 ≤ 10,000
0 ≤ num2 ≤ 10,000

입출력 예
num1	num2	result
2		3		-1
11		11		1
7		99		-1

입출력 예 설명

입출력 예 설명 #1
num1이 2이고 num2가 3이므로 다릅니다. 따라서 -1을 return합니다.

입출력 예 설명 #2
num1이 11이고 num2가 11이므로 같습니다. 따라서 1을 return합니다.

입출력 예 설명 #3
num1이 7이고 num2가 99이므로 다릅니다. 따라서 -1을 return합니다.
 */

package level_0;

public class Training_01_221226 {

	public static void main(String[] args) {
		NumComparison nc = new NumComparison();
		
		int num1_1 = 2;
		int num1_2 = 11;
		int num1_3 = 7;
		
		int num2_1 = 3;
		int num2_2 = 11;
		int num2_3 = 99;
		
		System.out.println(nc.solution(num1_1, num2_1));
		System.out.println(nc.solution(num1_2, num2_2));
		System.out.println(nc.solution(num1_3, num2_3));
		
	}

}

class NumComparison {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        
        return answer;
    }
}