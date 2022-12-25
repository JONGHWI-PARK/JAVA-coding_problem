/*
두 수의 곱

문제 설명
정수 num1, num2가 매개변수 주어집니다. 
num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ num1 ≤ 100
0 ≤ num2 ≤ 100

입출력 예
num1	num2	result
3		4		12
27		19		513

입출력 예 설명

입출력 예 #1
num1이 3, num2가 4이므로 3 * 4 = 12를 return합니다.

입출력 예 #2
num1이 27, num2가 19이므로 27 * 19 = 513을 return합니다.
 */

package level_0;

public class Training_03_221225 {

	public static void main(String[] args) {
		Multi multi = new Multi();
		
		int num1_1 = 3;
		int num1_2 = 27;
		
		int num2_1 = 4;
		int num2_2 = 19;
		
		System.out.println(multi.solution(num1_1, num2_1));
		System.out.println(multi.solution(num1_2, num2_2));
	}

}

class Multi {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(0 <= num1 && num1 <= 100) {
            if(0 <= num2 && num2 <= 100) {
                answer = num1 * num2;
            }
        }
        return answer;
    }
}