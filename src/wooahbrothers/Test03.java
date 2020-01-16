package wooahbrothers;

import java.util.Arrays;

public class Test03 {

	public int solution(int[] pobi, int[] crong) {
	
		if(pobi[0]+1!=pobi[1]||crong[0]+1!=crong[1])
			return -1;
		
		int result;
		String[] left_pobi=Integer.toString(pobi[0]).split("");
		String[] right_pobi=Integer.toString(pobi[1]).split("");
		String[] left_crong=Integer.toString(crong[0]).split("");
		String[] right_crong=Integer.toString(crong[1]).split("");
		int[] result_pobi = new int[] {1,1,1,1}; // +, * , +, *
		int[] result_crong = new int[] {1,1,1,1}; // initialize to 1 for * 		
		
		for (int i = 0; i < left_pobi.length; i++) {
			result_pobi[0]+=Integer.parseInt(left_pobi[i]);
			result_pobi[1]*=Integer.parseInt(left_pobi[i]);
		}
		for (int i = 0; i < right_pobi.length; i++) {
			result_pobi[2]+=Integer.parseInt(right_pobi[i]);
			result_pobi[3]*=Integer.parseInt(right_pobi[i]);
		}
		for (int i = 0; i < left_crong.length; i++) {
			result_crong[0]+=Integer.parseInt(left_crong[i]);
			result_crong[1]*=Integer.parseInt(left_crong[i]);
		}
		for (int i = 0; i < right_crong.length; i++) {
			result_crong[2]+=Integer.parseInt(right_crong[i]);
			result_crong[3]*=Integer.parseInt(right_crong[i]);
		}
		
		Arrays.sort(result_pobi);
		Arrays.sort(result_crong);

		if(result_pobi[3]>result_crong[3])
			result=1;
		else if(result_pobi[3]<result_crong[3])
			result=2;
		else
			result=0;
		
		return result;
	}
	public static void main(String[] args) {
		Test03 t3 = new Test03();
		System.out.println(t3.solution(new int[] {97,98}, new int[] {197,198}));
		System.out.println(t3.solution(new int[] {131,132}, new int[] {211,212}));
		System.out.println(t3.solution(new int[] {99,102}, new int[] {211,212}));
	}
}
