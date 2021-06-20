import java.util.*;

public class Main {

	public String  solution(String s1,String s2) {
			String answer ="YES";
			
			HashMap<Character,Integer> map=new HashMap<>();
			
			for(char x: s1.toCharArray()) {
				map.put(x, map.getOrDefault(x, 0)+1);
			}
			
			for(char x: s2.toCharArray()) {
				if(!map.containsKey(x)||map.get(x)==0) return "NO";
				map.put(x,map.get(x)-1);
			}
			/*
			HashMap<Character,Integer> map1=new HashMap<>();
			HashMap<Character,Integer> map2=new HashMap<>();
			
			for(char x : s1.toCharArray()) {
				map1.put(x, map1.getOrDefault(x, 0)+1);
			}
			for(char x : s2.toCharArray()) {
				map2.put(x, map2.getOrDefault(x, 0)+1);
			}
			
			if(map1.size()!=map2.size()) {
				answer="NO";
				return answer;
				}
			
			for(char key:map1.keySet()) {
				if(map1.get(key)!=map2.getOrDefault(key,0)) {
					answer="NO";	
					return answer;
					}
			}*/
			

			return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String str1=kb.next();
		String str2=kb.next();


		System.out.print(T.solution(str1,str2));

}
}
	

/*
import java.util.*;

public class Main {

	public String  solution(String str1,String str2) {
			String answer ="YES";
			HashMap<Character,Integer> map=new HashMap<>();
			for(char x:str1.toCharArray()) {
				map.put(x, map.getOrDefault(x, 0)+1);
			}
			
			for(char x:str2.toCharArray()) {
				if(!map.containsKey(x)||map.get(x)==0) return "NO";
				map.put(x, map.get(x)-1);
			}

			return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String str1=kb.next();
		String str2=kb.next();
		

		System.out.print(T.solution(str1,str2));

}
}
	
*/