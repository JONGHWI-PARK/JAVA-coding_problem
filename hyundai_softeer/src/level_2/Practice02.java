/*
장애물 인식 프로그램
(https://softeer.ai/practice/info.do?idx=1&eid=409)
 */

package level_2;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Practice02 {
	
	static Queue<Point> qpoint = new LinkedList<>();
	
	static int[][] arr;
	static int[][] checkArr;
	static String[] strArr;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		checkArr = new int[n][n];
		strArr = new String[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				checkArr[i][j] = 0;
			}
		}
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(sc.nextLine());
			String str = st.nextToken();
			for(int j = 0; j < n; j++) {
				arr[i][j] = Character.getNumericValue(str.charAt(j));				
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == 1 && checkArr[i][j] != 1) {
					int c = line(i, j);
					list.add(c);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public static int line(int a, int b) {
		int count = 0;
		
		qpoint.offer(new Point(a, b));
		checkArr[a][b] = 1;
		count++;
		while(!qpoint.isEmpty()) {
			Point tmp = qpoint.poll();
			
			if(tmp.y < arr.length - 1 ) {
				if(arr[tmp.y+1][tmp.x] == 1 && checkArr[tmp.y+1][tmp.x] != 1) { // 아래
					qpoint.offer(new Point(tmp.y+1, tmp.x));
					checkArr[tmp.y+1][tmp.x] = 1;
					count++;
				}				
			}
			
			if(tmp.y > 0) {				
				if(arr[tmp.y-1][tmp.x] == 1 && checkArr[tmp.y-1][tmp.x] != 1) { // 위
					qpoint.offer(new Point(tmp.y-1, tmp.x));
					checkArr[tmp.y-1][tmp.x] = 1;
					count++;
				}
			}
			
			if(tmp.x > 0) {
				if(arr[tmp.y][tmp.x-1] == 1 && checkArr[tmp.y][tmp.x-1] != 1) { // 좌
					qpoint.offer(new Point(tmp.y, tmp.x-1));
					checkArr[tmp.y][tmp.x-1] = 1;
					count++;
				}				
			}
			
			if(tmp.x < arr.length - 1) {
				if(arr[tmp.y][tmp.x+1] == 1 && checkArr[tmp.y][tmp.x+1] != 1) { // 우
					qpoint.offer(new Point(tmp.y, tmp.x+1));
					checkArr[tmp.y][tmp.x+1] = 1;
					count++;
				}				
			}

		}
		return count;
	}
}

class Point {
	int x;
	int y;
	
	Point(int y, int x) {
		this.x = x;
		this.y = y;
	}
}
