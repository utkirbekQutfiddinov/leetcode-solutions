class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb=null;
        int sum=0;
        while(s.length()>k){
            sb=new StringBuilder("");
            for(int i=0; i<s.length(); i+=k){
                sb.append(getSum(s,i,k));
            }
        s=sb.toString();
        }
        return s;
    }

    private int getSum(String s, int from, int count){
        int sum=0;
        for(int i=from; i<s.length() && i<from+count; i++){
            sum+=s.charAt(i)-'0';
        }
        return sum;
    }

}