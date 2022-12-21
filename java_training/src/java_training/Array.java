package java_training;

public class Array {

	public static void main(String[] args) {
		// 문제 1, num 배열에 저장된 요소의 합을 구하시오
		
		int[] num = {12, 56, 23, 39};
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum = " + sum);

		// 문제2, num2 배열에 저장된 요소의 합과 평균을 구하시오
		
		int[] num2 = new int[] {3, 6, 9, 12, 137};
		int sum2 = 0;
		for(int j = 0; j < num2.length; j++) {
			sum2 += num2[j];
		}
		System.out.println("sum2 = " + sum2);
		

		// 문제3, num3 배열에 저장된 요소의 최대값을 출력하시오
		
		// sol 1) 조건식으로만 풀었을 때
		int[] num3 = {56, 39, 89};
		if(num3[0] > num3[1] && num3[0] > num3[2]) {
			int max = num3[0];
			System.out.println("max = " + max);
		} else if(num3[1] > num3[2]) {
			int max = num3[1];
			System.out.println("max = " + max);
		} else {
			int max = num3[2];
			System.out.println("max = " + max);
		}
		
		// sol 2) 반복문으로 풀었을 때
		int[] num3_1 = {39, 23, 56, 152, 59, 96, 85};
		int max2 = num3_1[0];
		
		for(int k = 0; k < num3_1.length; k++) {
			if(max2 < num3_1[k]) {
				max2 = num3_1[k];
			}
		}
		System.out.println("max = " + max2);
		
		// sol 3) 함수 사용
		int max3 = 0;
		for(int m : num3_1) max3 = Math.max(m, max3);
		
		System.out.println("max = " + max3);
			
		// 문제4, num4 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오
		
		int[] num4 = {39, 23, 56, 59, 96, 85};
		int even = 0; // 짝수의 합
		int odd = 0; // 홀수의 합
		
		for(int n = 0; n < num4.length; n++) {
			if(num4[n] % 2 == 0) {
				even += num4[n];
			} else {
				odd += num4[n];
			}
		}
		System.out.println("짝수의 합 = " + even);
		System.out.println("홀수의 합 = " + odd);
	}
}