/*
 * 
 * 최소, 최대
 * 
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * 
 * 예제 입력 1 
 * 5
 * 20 10 35 30 7
 * 
 * 예제 출력 1 
 * 7 35
 * 
 */

package baekjoon_220927;

import java.util.Arrays;
import java.util.Scanner;

public class No10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		// sol 01 : max와 min의 초기값을 arr[0]로 잡으면 왜 값이 안나오는지 몰겠다.
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i = 1; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			
//			if(max < arr[i]) {
//				max = arr[i];
//			} 
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min + " " + max);
		
		// sol 02
		int max = -9999;
		int min = 9999;
		
		for(int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextInt();
			
			if(max < arr[j]) {
				max = arr[j];
			} 
			if(min > arr[j]) {
				min = arr[j];
			}
		}
		System.out.println("최소1 : " + min + " " + "최대1 : " + max);
		
		// sol 03 : Math 함수 사용
		for(int j : arr) max = Math.max(j, max);
		for(int j : arr) min = Math.min(j, min);
		
		System.out.println("최소2 : " + min + " " + "최대2 : " + max);
		
		// sol 04 : Array.sort() 메소드 사용
		sc.close();
		Arrays.sort(arr); // 오름 차순 정렬
		System.out.println("최소3 : " + arr[0] + " " + "최대3 : " + arr[N - 1]);
	}
}