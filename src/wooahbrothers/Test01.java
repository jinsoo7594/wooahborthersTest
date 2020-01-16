package wooahbrothers;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	
	public int[] solution(int money) {
		
		int[] result = new int[9]; // set result number to return
		int[] filter = new int[] {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		for(int i=0; i<9; i++) {
			if(money>filter[i]) {
				result[i] = money/filter[i];
				money = money%filter[i];
			}
		}
		

		return result;
	}
	
	public static void main(String[] args) {
		
		Test01 t1 = new Test01();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 입력: ");
		for(int n : t1.solution(sc.nextInt())) {
			System.out.print(n+" ");
		}
		System.out.println(Arrays.toString(t1.solution(sc.nextInt())));
		//Arrays.sort()와 Arrays.toString()을 잊지말자.
	}
}
