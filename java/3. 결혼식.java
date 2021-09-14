import java.util.*;

class People implements Comparable<People>{
	int time;
	char  state;
	
	People(int time, char state){
		this.time=time;
		this.state=state;
	}
	
	@Override
	public int compareTo(People o) {
		if(this.time==o.time) return this.state-o.state;
		else return this.time-o.time;
	}
}

class Main {	
	public int solution(ArrayList<People> arr) {
		int cnt=0;
		Collections.sort(arr);
		int max=Integer.MIN_VALUE;
		for(People ob:arr) {
			if(ob.state=='s') cnt++;
			else cnt--;
			max=Math.max(max, cnt);
		}
		return max;
	}
	
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		int n=kb.nextInt();
		ArrayList<People> arr= new ArrayList<>();
		for(int i=0;i<n;i++) {
			int sT=kb.nextInt();
			int eT=kb.nextInt();
			arr.add(new People(sT,'s'));
			arr.add(new People(eT,'e'));
		}
		System.out.print(T.solution(arr));
		
	}
}