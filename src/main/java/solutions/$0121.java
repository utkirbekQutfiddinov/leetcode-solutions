package solutions;

public class $0121 {
        public int maxProfit(int[] prices) {
            int res=0;
            int buy=Integer.MAX_VALUE;
            int curr=0;
            for(int i=0; i<prices.length; i++){
                if(prices[i]<buy) buy=prices[i];
                curr=prices[i]-buy;
                if(curr>res) res=curr;
            }
            return res;
        }
    }
