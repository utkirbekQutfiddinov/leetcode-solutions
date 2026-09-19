class Solution {
    public int smallestNumber(int n) {
        String bits=Integer.toBinaryString(n);
        while(bits.indexOf('0')>-1){
            n++;
            bits=Integer.toBinaryString(n);
        }
        return n;
    }
}