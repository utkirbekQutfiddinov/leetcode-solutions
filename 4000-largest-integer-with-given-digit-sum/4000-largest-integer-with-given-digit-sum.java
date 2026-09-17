class Solution {
    public int largestInteger(int n, int s) {
        StringBuilder sb=new StringBuilder();
        int num=9;
        while(s>0 && num>0){
            while(s>=num){
                sb.append(num);
                s-=num;
            }
            num--;
        }
        if(sb.length()>n){
            return -1;
        }else{
            sb.append("0".repeat(n-sb.length()));
        }
        return Integer.parseInt(sb.toString());
    }
}