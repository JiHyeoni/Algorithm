class Solution {
    int [] check;
    int answer;
    public int solution(int[] nums) {
        answer = 0;
        check=new int[nums.length];

        dfs(0,0,0,nums);


        return answer;
    }
    public void dfs(int L,int sum,int k,int nums[]){
        if(L==3){
            //System.out.println(sum);
            if(isPrime(sum)) answer++;
            return;
        }
        else{
            for(int i=k;i<nums.length;i++){
                if(check[i]==0){
                    check[i]=1;
                    dfs(L+1,sum+nums[i],i,nums);
                    check[i]=0;
                }
            }
        }
    }

    public boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0) return false;
        }
        return true;
    }
}