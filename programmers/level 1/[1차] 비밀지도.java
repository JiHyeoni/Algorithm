class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String a1=String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr1[i])));
            String a2=String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr2[i])));
            String b="";
            for(int j=0;j<n;j++){
                if(a1.charAt(j)=='1'||a2.charAt(j)=='1') b+="#";
                else b+=" ";
            }
            answer[i]=b;
        }
        return answer;
    }
}