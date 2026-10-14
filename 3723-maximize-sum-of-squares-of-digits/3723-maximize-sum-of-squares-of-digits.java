class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<num; i++){
            if(sum>9){
                sb.append("9");
                sum-=9;
            }else{
                sb.append(""+sum);
                sum=0;
            }
        }
        if(sum>0) return "";

        while(sb.length()<num){
            sb.append("0");
        }
        return sb.toString();
    }
}