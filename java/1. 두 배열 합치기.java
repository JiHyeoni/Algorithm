import java.util.*;

public class Main {

	public ArrayList<Integer>  solution(int n,int m, int [] arr1, int[] arr2) {
			ArrayList<Integer> answer= new ArrayList<>();
			int p1=0,p2=0;
			
			while(p1<n&&p2<m) {
				if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
				else answer.add(arr2[p2++]);
			}
			
			while(p1<n) {
				answer.add(arr1[p1++]);
			}
			while(p2<m) {
				answer.add(arr2[p2++]);
			}
	
			return answer;
		/*	
	 	int[] answer=new int[n+m];
		int a=0,b=0,c=0;

		while(a<n && b<m) {
			if(arr1[a]<arr2[b]) {
				answer[c]=arr1[a];
				a++;
				c++;
			}
			else if(arr1[a]>arr2[b]) {
				answer[c]=arr2[b];
				b++;
				c++;
			}
			else if(arr1[a]==arr2[b]) {
				answer[c]=arr1[a];
				a++;
				c++;
				answer[c]=arr2[b];
				b++;
				c++;
			}
		}
		
		if(a!=n) {
			while(a<n) {
				answer[c]=arr1[a];
				a++;
				c++;
			}
		}
		else if(b!=m) {
			while(b<m) {
				answer[c]=arr2[b];
				b++;
				c++;
			}
		}
		return answer;
		*/
		
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int [] arr1=new int[n];
		for (int i=0;i<n;i++) {
			arr1[i]=kb.nextInt();
		}
		int m=kb.nextInt();
		int [] arr2=new int[m];
		for (int i=0;i<m;i++) {
			arr2[i]=kb.nextInt();
		}
		
		for (int x: T.solution(n,m, arr1,arr2)) {
			System.out.print(x +" ");
		}
		
}
}
	

