class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        int n=len/8;
        return (8*n*(n+1))/2+len%8*(n+1);
    }
}