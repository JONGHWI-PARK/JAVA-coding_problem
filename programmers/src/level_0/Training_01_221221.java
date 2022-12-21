/*
최댓값 만들기 (1)

문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ numbers의 원소 ≤ 10,000
2 ≤ numbers의 길이 ≤ 100
----------------------
입출력 예
numbers					result
[1, 2, 3, 4, 5]			20
[0, 31, 24, 10, 1, 9]	744
----------------------
입출력 예 설명

입출력 예 #1
두 수의 곱중 최댓값은 4 * 5 = 20 입니다.

입출력 예 #2
두 수의 곱중 최댓값은 31 * 24 = 744 입니다.
*/

package level_0;

import java.util.Arrays;

public class Training_01_221221 {

	public static void main(String[] args) {
		Max_num max_num = new Max_num();
		
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {0, 31, 24, 10, 1, 9};
		
		System.out.println("두 수의 곱중 최댓값은 4 * 5 = " + max_num.solution(num1) + " 입니다.");
		System.out.println("두 수의 곱중 최댓값은 31 * 24 = " + max_num.solution(num2) + " 입니다.");
	}
}

class Max_num {
	public int solution(int[] numbers) {
		int answer = 0;
		
		Arrays.sort(numbers); // 오름차순 정렬을 하여 가장 큰수와 두번째로 큰수를 곱해서 최댓값을 구한다.
		
		answer = numbers[numbers.length-1] * numbers[numbers.length-2];
		
		return answer;
	}
}
