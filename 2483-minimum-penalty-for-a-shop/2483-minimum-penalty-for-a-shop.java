class Solution {
    public int bestClosingTime(String customers) {
        int remainingY=0;

        for(char c: customers.toCharArray()){
            if(c=='Y'){
                remainingY++;
            }
        }

        int seenN=0;

        int[] penalties=new int[customers.length()+1];

        penalties[0]=remainingY;

        for(int i=1; i<penalties.length; i++){
            if(customers.charAt(i-1)=='Y'){
                remainingY--;
            }else {
                seenN++;
            }
            
            penalties[i]=remainingY+seenN;
        }

        int minPenaltyIndex=0;

        for(int i=0; i<penalties.length; i++){
            if(penalties[i]<penalties[minPenaltyIndex]){
                minPenaltyIndex=i;
            }
        }

        return minPenaltyIndex;
    }
}