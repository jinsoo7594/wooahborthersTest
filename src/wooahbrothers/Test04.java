package wooahbrothers;

public class Test04 {

	public int solution(int number) {
		
		int result=0;
		
		for(int j=0; j<number; j++) {
			String[] tsn = Integer.toString(j+1).split("");
			for (int i = 0; i < tsn.length; i++) {
				if(tsn[i].equals("3")||tsn[i].equals("6")||tsn[i].equals("9"))
					result++;
			}
		
		}
		return result;
	}
	
	public static void main(String[] args) {
	
		Test04 t4 = new Test04();
		System.out.println(t4.solution(13));
		System.out.println(t4.solution(33));
	}
}
