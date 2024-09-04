class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        return (1+c1.charAt(0)+c1.charAt(1))%2==(1+c2.charAt(0)+c2.charAt(1))%2;
    }
}