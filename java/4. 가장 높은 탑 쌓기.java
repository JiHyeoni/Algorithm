import java.util.*;

class Brick implements Comparable<Brick>{
	int s;
	int h;
	int w;
	Brick(int s,int h,int w){
		this.s=s;
		this.h=h;
		this.w=w;
	}
	
	@Override
	public int compareTo(Brick o) {
		return o.s-this.s;
	}
}

class Main {
	static int [] dy;
	static int n;
	public int solution(ArrayList<Brick> arr) {
		int answer=0;
		Collections.sort(arr);
		dy=new int[n];
		dy[0]=arr.get(0).h;
		answer=dy[0];
		for(int i=1;i<n;i++) {
			int max=0;
			for(int j=i-1;j>=0;j--) {
				if(arr.get(i).w<arr.get(j).w && max<dy[j]) max=dy[j];
			}
			dy[i]=max+arr.get(i).h;
			answer=Math.max(answer, dy[i]);
		}
		return answer;
	}

	public static void main(String[] args){
		
		Main T = new Main();
		Scanner kb=new Scanner(System.in);
		n=kb.nextInt();
		ArrayList<Brick> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a=kb.nextInt();
			int b=kb.nextInt();
			int c=kb.nextInt();
			
			arr.add(new Brick(a,b,c));
		}
		System.out.print(T.solution(arr));

	}
}