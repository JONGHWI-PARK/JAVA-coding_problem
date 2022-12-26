package level_0;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String str = "tjdnf,eowjs,eorn,qntks,dlscjs,dnftks";
		String[] cityArr = str.split(",");
		
		for(int i = 0; i < cityArr.length; i++) {
			System.out.println(cityArr[i]);
		}
		
		String str2 = Arrays.toString(cityArr);
		System.out.print(str2);
	}

}
