class Solution {
    public boolean consecutiveSetBits(int n) {
        int count=0;
        String str=Integer.toBinaryString(n);

        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("11")){
                count++;
            }
        }
        return count==1;
    }
}