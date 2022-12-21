/*
 * 
완주하지 못한 선수

문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

입출력 예
participant													completion										return
["leo", "kiki", "eden"]										["eden", "kiki"]								"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]			["josipa", "filipa", "marina", "nikola"]		"vinko"
["mislav", "stanko", "mislav", "ana"]						["stanko", "ana", "mislav"]						"mislav"

입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
*
*/


package algorithm_hash;

import java.util.HashMap;

public class Training_02 {

	public static void main(String[] args) {
		Player player = new Player();
		
		String[] par_arr1 = {"leo", "kiki", "eden"};
		String[] par_arr2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] par_arr3 = {"mislav", "stanko", "mislav", "ana"};
		
		String[] com_arr1 = {"eden", "kiki"};
		String[] com_arr2 = {"josipa", "filipa", "marina", "nikola"};
		String[] com_arr3 = {"stanko", "ana", "mislav"};
		
		System.out.println(player.solution(par_arr1, com_arr1));
		System.out.println(player.solution(par_arr2, com_arr2));
		System.out.println(player.solution(par_arr3, com_arr3));
	}
}

// set HasMap에 저장되어 있는 데이터 읽어오기
// get 특정 key값에 해당하는 value값 반환

class Player {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String player : participant) map.put(player, map.getOrDefault(player, 0) + 1);
        // HashMap에 player(key)가 없을 때, 0(defaultValue - 지정된 값)을 반환
        for(String player : completion) map.put(player, map.get(player) - 1);
        
        for(String key : map.keySet()) {
        	if(map.get(key) != 0) {
        		answer = key;
        	}
        }
        
        return answer;
    }
}