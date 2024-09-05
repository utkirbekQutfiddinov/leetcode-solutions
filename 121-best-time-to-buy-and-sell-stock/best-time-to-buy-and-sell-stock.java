class Solution {
    public int maxProfit(int[] prices) {
        int num=prices[0];

        for(int i=0; i<prices.length; i++){
            if(prices[i]<num){
                num=prices[i];
            }

            prices[i]=prices[i]-num;
        }

        num=prices[0];

        for(int i: prices){
            if(i>num){
                num=i;
            }
        }
    return num;
    }
}