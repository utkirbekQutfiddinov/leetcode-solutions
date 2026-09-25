class Solution {
    public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
        int max=0, curr=0;
        for(char c: str.toCharArray()){
            if(c=='1'){
                max=Math.max(max,curr);
                curr=1;
            }else if(c=='0'){
                curr++;
            }else if(curr>0){
                curr=0;
            }
        }

        return max;    
        }
}