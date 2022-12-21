/*
 * 
 * 짝수와 홀수
 * 
 * 문제 설명
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 * 
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 * 
 * 입출력 예
 * num	return
 * 3	"Odd"
 * 4	"Even"
 * 
 */

package algorithm_hash;

import java.util.Scanner;

public class Training_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				
		String answer = (num % 2 == 0) ? "Even" : "Odd"; 
		// 삼항 연산자
		// 정수 num을 2로 나눈 나머지가 0이면 짝수라 Even 출력 아니면 홀수라 Odd 출력
		System.out.println(answer);
	}

}
