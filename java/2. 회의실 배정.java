import java.util.*;

class Time implements Comparable<Time>{
	int s,e;
	Time(int s, int e){
		this.s=s;
		this.e=e;
	}
	
	@Override
	public int compareTo (Time o) {
		if(this.e==o.e) return this.s-o.s;
		else return this.e-o.e;
	}
	
}



class Main {	
	
	public int solution(ArrayList<Time> arr) {
		int cnt=0;
		int et=0;
		Collections.sort(arr);
		for(Time ob:arr) {
			if(ob.s>=et) {
				//System.out.println(ob.s+" "+ob.e);
				cnt++;
				et=ob.e;
			}
		}
		return cnt;
	}

	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		ArrayList<Time> arr=new ArrayList<>();
		int n=kb.nextInt();
		
		for(int i=0;i<n;i++) {
			int s=kb.nextInt();
			int e=kb.nextInt();
			arr.add(new Time(s,e));
		}
		
		System.out.print(T.solution(arr));

}
}