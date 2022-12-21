package java_training;

public class Loop {

	public static void main(String[] args) {
		// 문제1. 1 ~ 10 까지 홀수 값의 합
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
		System.out.println("-------------------------------");
		
		
		// 문제2. 1 ~ 10 까지 짝수 값의 합
		
		int sum2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("sum2 = " + sum2);
		System.out.println("-------------------------------");
		
		/*
		 * 문제 3.
		 * 	★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
			★★★★★★★★
		 */
		
		for(int i = 0; i <= 7; i++) {
			for(int j = 0; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------");
		
		/*
		 * 문제 4. 
			★★★★★★★★
			★★★★★★★
			★★★★★★
			★★★★★
			★★★★
			★★★
			★★
			★
		 */
		
		for(int i = 0; i <= 7; i++) {
			for(int j = i; j <= 7; j++) {	// 별이 줄어들어야 하므로 j의 초기식을 i와 동일하게 하여
				System.out.print("*");		// 별의 갯수를 줄여나간다.
			}
			System.out.println("");
		}
		System.out.println("-------------------------------");
		
		/*
		 * 문제 5.
			★
			★★
			★★★
			★★★★
			★★★★★
			★★★★★★
			★★★★★★★
			★★★★★★★★
		 */
		
		for(int i = 7; i >= 0; i--) {	// 위와는 반대로 첫번째 *이 1개 부터 시작이므로 조건에 맞으려면 i의 초기 값을 7로 시작해야한다.
			for(int j = i; j <= 7; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------");
		
		/*
		 * 문제 6. 2단 ~ 9단까지 구구단 출력(결과만 나와도 가능)
		 * 		  2중 for문, 2중 while문
		 */
		
		// for
		int multi = 0;
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				multi = i * j;
				System.out.println(i + " * " + j + " = " + multi);
			}
		}
		System.out.println("-------------------------------");
		
		// while
		int multi2 = 0;
		int i = 2;
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				multi2 = i * j;
				System.out.println(i + " * " + j + " = " + multi2);
				j++;
			}
			i++;
		}
	}
}