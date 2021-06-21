import java.util.*;

public class Main {

	public ArrayList<Integer>  solution(int n,int m,int[]arr) {
			ArrayList<Integer> answer =new ArrayList<>();
			HashMap<Integer,Integer> map=new HashMap<>();
			
			for(int i=0;i<m-1;i++) {
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			}
			int lt=0;
			for(int rt=m-1;rt<n;rt++) {
				map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
				answer.add(map.size());
				map.put(arr[lt], map.get(arr[lt])-1);
				if(map.get(arr[lt])==0) map.remove(arr[lt]);
				lt++;
			}
			/*
			for(int i=0;i<n-m+1;i++) {
				HashMap<Integer,Integer> map=new HashMap<>();
				for(int j=i;j<i+m;j++) {
					map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
				}
				answer.add(map.size());
			}*/

			return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}

		for(int x:T.solution(n,m,arr)) {
			System.out.print(x +" ");
		}

}
}
	

