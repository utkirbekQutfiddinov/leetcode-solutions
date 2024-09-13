class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder(String.valueOf(n));

        int ind=0;
        for(int i=sb.length()-1; i>0; i--){
            ind++;
            if(ind%3==0){
                sb.insert(i,'.');
                ind=0;
            }
        }
        return sb.toString();
    }
}