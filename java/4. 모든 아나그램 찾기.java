import java.util.*;

public class Main {

	public int  solution(String s1,String s2) {
			int answer =0;
			HashMap<Character, Integer> am=new HashMap<>();
			HashMap<Character, Integer> bm=new HashMap<>();
			
			for(char x : s2.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
			
			int L=s2.length()-1;
			for(int i=0; i<L; i++) am.put(s1.charAt(i), am.getOrDefault(s1.charAt(i), 0)+1);
			
			int lt=0;
			for(int rt=L; rt<s1.length(); rt++){
				am.put(s1.charAt(rt), am.getOrDefault(s1.charAt(rt), 0)+1);
				if(am.equals(bm)) answer++;
				am.put(s1.charAt(lt), am.get(s1.charAt(lt))-1);
				if(am.get(s1.charAt(lt))==0) am.remove(s1.charAt(lt));
				lt++;
			}
			
			/*
			char [] arr = new char[s1.length()];
			int k=0;
			for(char x:s1.toCharArray()) {
				arr[k]=x;
				k++;
			}
			HashMap<Character,Integer> map=new HashMap<>();
			HashMap<Character,Integer> map2=new HashMap<>();
			
			for(char x:s2.toCharArray()) {
				map2.put(x, map2.getOrDefault(x, 0)+1);
			}
			for(int i=0;i<s2.length()-1;i++) {
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			}
			int lt=0;
			for(int rt=s2.length()-1;rt<s1.length();rt++) {
				map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
				if(map.equals(map2)) answer++;
				map.put(arr[lt], map.get(arr[lt])-1);
				if(map.get(arr[lt])==0) map.remove(arr[lt]);
				lt++;
			}
			*/


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
	

