class Solution {
    public long removeZeros(long n) {
        return Long.parseLong(String.valueOf(n).replaceAll("0",""));
    }
}