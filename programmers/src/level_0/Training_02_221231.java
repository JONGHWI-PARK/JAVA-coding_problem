/*
짝수는 싫어요

문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100

입출력 예
n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]

입출력 예 설명

입출력 #1
10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.

입출력 #1
15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
 */


package level_0;

import java.util.Arrays;

public class Training_02_221231 {

	public static void main(String[] args) {
		HateEven he = new HateEven();
		
		int n1 = 10;
		int n2 = 15;
		
		System.out.println(he.solution(n1));
		System.out.println(he.solution(n2));
	}

}

class HateEven {
    public int[] solution(int n) {
        int[] answer = {};
        int k = 0;
        
        if(n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n+1) / 2];
        }
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                answer[k] = i;
                k++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}