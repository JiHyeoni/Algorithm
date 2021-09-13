import java.util.*;

class Body implements Comparable<Body>{
	
	int height,weight;
	Body(int height,int weight){
		this.weight=weight;
		this.height=height;
	}
	
	@Override
	public int compareTo(Body o) {
		if(o.height==this.height) return o.weight-this.weight;
		else return o.height-this.height;
	}
}


class Main {	

	
	public int solution(ArrayList<Body> arr) {
		int cnt=0;
		Collections.sort(arr);
		int max=Integer.MIN_VALUE;
		
		for(Body ob:arr) {
			if(ob.weight>max) {
				max=ob.weight;
				cnt++;
			}
		}
		
		return cnt;
	}
	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		
		int n=kb.nextInt();
		ArrayList<Body> arr= new ArrayList<>();
		for(int i=0;i<n;i++) {
			int height=kb.nextInt();
			int weight=kb.nextInt();
			arr.add(new Body(height,weight));
		}
		
		System.out.print(T.solution(arr));
		
	}
}