class Solution {
    public int findComplement(int num) {
        
        char[] chars=Integer.toBinaryString(num).toCharArray();
        
        int x=1;
        int sum=0;
        for(int i=chars.length-1; i>=0; i--){
            sum+=x*((chars[i]+1)%2);
            x*=2;
        }

        return sum;
    }
}