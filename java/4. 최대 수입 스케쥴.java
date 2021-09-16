import java.util.*;

class Lecture implements Comparable<Lecture>{
	int m;
	int d;
	Lecture(int m,int d){
		this.m=m;
		this.d=d;
	}
	
	@Override
	public int compareTo(Lecture o) {
		return o.d-this.d;
	}
}
class Main {	
	static int n,max=Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr) {
		PriorityQueue<Integer> pQ=new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int sum=0;
		int j=0;
		for(int i=max;i>=1;i--) {
			for(;j<n;j++) {
				if(i>arr.get(j).d) break;
				pQ.add(arr.get(j).m);
			}
			if(!pQ.isEmpty()) sum+=pQ.poll();
		}
		return sum;
	}

	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		ArrayList<Lecture> arr=new ArrayList<>();
		
		n=kb.nextInt();
		
		for(int i=0;i<n;i++) {
			int m=kb.nextInt();
			int d=kb.nextInt();
			arr.add(new Lecture(m,d));
			if(max<d) max=d;
		}
		
		System.out.print(T.solution(arr));
		
	}
}