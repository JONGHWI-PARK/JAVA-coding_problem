package baekjoon_230115;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean isGroupWord;
        int[] alphabetCount = new int[26];

        for (int i = 0; i < n; i++) {
            isGroupWord = true;
            char prev = '0';
            for (int j = 0; j < 26; j++) {
                alphabetCount[j] = 0;
            }

            String word = sc.next();
            for (int j = 0; j < word.length(); j++) {
                char current = word.charAt(j);
                int index = current - 'a';
                if (alphabetCount[index] == 1 && prev != current) {
                    isGroupWord = false;
                    break;
                }
                prev = current;
                alphabetCount[index] = 1;
            }
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}
