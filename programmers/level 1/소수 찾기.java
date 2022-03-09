class Solution {
    public boolean isPrime(int number){
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0) return false;
        }
        return true;
    }

    public int solution(int n) {
        int answer = 0;
        boolean check[]=new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(check[i]==true) continue;

            if(isPrime(i)) {
                answer++;
                for(int j=i;j<=n;j=j+i)
                    check[i]=true;
            }

        }
        return answer;
    }
}