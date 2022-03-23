class Solution {
    static Integer check[]=new Integer[100001];
    public static int solution(int n) {
        int answer = 0;
        answer=fibonacci(n)%1234567;
        return answer;
    }

    public static Integer fibonacci(int n){
        if(check[n]!=null) return check[n];
        if(n==0) return check[0]=0;
        else if(n==1) return check[1]=1;
        else{
            return check[n]=(fibonacci(n-1)+fibonacci(n-2))%1234567;
        }
    }
}