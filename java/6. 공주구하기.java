import java.util.*;
class Main {	
	public int solution(int n, int m){
		int answer=0;
		Queue <Integer> q=new LinkedList<>();
		for(int i=1;i<=n;i++) q.offer(i);
		while(!q.isEmpty()) {
			for(int i=1;i<m;i++) q.offer(q.poll());
			q.poll();
			if(q.size()==1) answer=q.poll();
		}
		
		/*
		for(int i=1;i<n+1;i++) {
			q.add(i);
		}
		int cnt=0;
		while(q.size()!=1) {
			if(cnt==m-1) {
				q.remove();
				cnt=0;
			}
			else {
				q.add(q.poll());
				cnt++;
			}
		}
		answer=q.poll();
		*/
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int m=kb.nextInt();
		
		System.out.println(T.solution(n,m));
	}
}