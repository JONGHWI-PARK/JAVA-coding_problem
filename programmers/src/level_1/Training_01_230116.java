/*
없는 숫자 더하기

문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다.

입출력 예
numbers				result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]		6

입출력 예 설명

입출력 예 #1
5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.

입출력 예 #2
1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
 */

package level_1;

import java.util.ArrayList;

public class Training_01_230116 {

	public static void main(String[] args) {
		
		NoNum nn = new NoNum();
		
		int[] num1 = {1,2,3,4,6,7,8,0};
		int[] num2 = {5,8,4,0,6,7,9};
		int[] num3 = {0};
		
		System.out.println(nn.solution(num1));
		System.out.println(nn.solution(num2));
		System.out.println(nn.solution(num3));
		
	}

}

class NoNum {
    public int solution(int[] numbers) {
        int answer = 0;
        
       ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(numbers[i] == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}