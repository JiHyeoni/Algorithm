class Solution {
    public int solution(int n) {
        //bitCount -> 비트데이터중 1 비트의 수를 카운트
        int count=Integer.bitCount(n);
        for(int i=n+1;;i++){
            if(Integer.bitCount(i)==count) return i;
        }
    }
}