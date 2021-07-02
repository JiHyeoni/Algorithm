import java.util.*;


class Main {	
	public int[] solution (int s,int n,int[]arr ) {
		int [] answer=new int[s];
		
		for(int x:arr) {
			int pos=-1;
			for(int i=0;i<s;i++) if(x==answer[i]) pos=i;
			
			if(pos==-1) {
				for(int i=s-1;i>0;i--) {
					answer[i]=answer[i-1];
				}
			}
			else {
				for(int i=pos;i>0;i--) {
					answer[i]=answer[i-1];
				}
			}
			answer[0]=x;
			
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int s=kb.nextInt();
		int n=kb.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=kb.nextInt();
		}

		for(int x : T.solution(s,n,arr)) {
			System.out.print(x+" ");
		}
		
	}
}
