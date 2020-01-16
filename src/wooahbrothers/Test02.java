package wooahbrothers;

import java.util.*;

public class Test02 {

	
	public String Solution(String word) {
		
		String result="";
		String [] origin = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < origin.length; i++) {
			map.put(origin[i], origin[origin.length-1-i]);
		}
				
		String [] splitted = word.split("");
		
		for (int j = 0; j < splitted.length; j++) {
			if(Character.isLetter(splitted[j].charAt(0))) {
				if(Character.isLowerCase(splitted[j].charAt(0))) {
					splitted[j]=splitted[j].toUpperCase();
				}
				if(map.containsKey(splitted[j])) {
					result+=map.get(splitted[j]);
				}else
					result+=" ";
			}else
				result+=" ";
						
		}
		/* before I know split() haha 
		
		List<String>list = new ArrayList<>(10);
		for (int i = 0; i <word.length(); i++) {
			list.add(i, word.substring(i, i+1));
		}
		for (int j = 0; j < list.size(); j++) {
			if(map.containsKey(list.get(j))) {
				result+=map.get(list.get(j));
			}
		}
		*/
		
		
		return result;
	}
	public static void main(String[] args) {
	
		Test02 test = new Test02();
		System.out.println(test.Solution("APPLEis77 best!Ah라a"));
		
		
	}
	
}
