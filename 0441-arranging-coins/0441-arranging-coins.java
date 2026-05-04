class Solution {
    public int arrangeCoins(int n) {
        int row=1;

        while(true){
            n-=row;
            if(n==0) return row;
            else if (n<0) return row-1;
            row++;
        }
    }
}