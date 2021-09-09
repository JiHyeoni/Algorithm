import java.util.*;

class Time implements Comparable<Time>{
	int time;
	char state;
	Time(int time, char state){
		this.time=time;
		this.state=state;
	}
	
	@Override
	public int compareTo (Time o) {
		if(this.time==o.time) return this.state-o.state;
		else return this.time-o.time;
	}
}



class Main {	
	
	public int solution(ArrayList<Time> arr) {
		int cnt=0;
		int max=Integer.MIN_VALUE;
		Collections.sort(arr);
		for(Time ob:arr) {
			if(ob.state=='s') cnt++;
			else if(ob.state=='e') cnt--;
			max=Math.max(max, cnt);
		}
		return max;
	}

	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		ArrayList<Time> arr=new ArrayList<>();
		int n=kb.nextInt();
		
		for(int i=0;i<n;i++) {
			int sT=kb.nextInt();
			int eT=kb.nextInt();
			
			arr.add(new Time(sT,'s'));
			arr.add(new Time(eT,'e'));
			
		}
		
		System.out.print(T.solution(arr));

}
}