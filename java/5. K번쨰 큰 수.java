import java.util.*;
class Main {	
	public int solution(int n, int m, int[]arr){
		int answer=0;
		TreeSet<Integer> Tset=new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					Tset.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}		
		int cnt=0;
		for(int x : Tset) {
			cnt++;
			if(cnt==m) return x;
		}
		

		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=kb.nextInt();
		
		System.out.print(T.solution(n,m,arr));
	}
}