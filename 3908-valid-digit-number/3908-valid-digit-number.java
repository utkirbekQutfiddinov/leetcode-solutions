class Solution {
    public boolean validDigit(int n, int x) {
        String str=""+n;
        String c=""+x;
        return str.indexOf(c)>0;
    }
}