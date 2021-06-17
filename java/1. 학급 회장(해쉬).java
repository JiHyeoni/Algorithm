import java.util.*;

public class Main {

	public char  solution(int n,String s) {
			char answer = ' ';
			HashMap<Character,Integer> map=new HashMap<>();
			for(char x:s.toCharArray()) {
				map.put(x, map.getOrDefault(x,0)+1); //getOrDefault->key값이 없을때 0으로 리턴
			}
			//System.out.println(map.containsKey('A')); //특정 키가 있는지
			//System.out.println(map.remove('A')); //특정 키 삭제, value값 리턴
			//System.out.println(map.size()); //키의 개수 알려줌
			int max=Integer.MIN_VALUE;
			for(char key:map.keySet()) {
				//System.out.println(key+" "+map.get(key));
				if(map.get(key)>max) {
					max=map.get(key);
					answer=key;
				}
			}

			return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		String str=kb.next();


		System.out.print(T.solution(n,str));

}
}
	

