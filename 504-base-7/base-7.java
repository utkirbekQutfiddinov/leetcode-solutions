class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder("");
        boolean isNegative=num<0;

        if(isNegative){
            num*=-1;
        }

        while(num!=0){
            sb.insert(0,String.valueOf(num%7));
            num/=7;
        }

        if(isNegative){
            sb.insert(0,'-');
        }
        return sb.toString();
    }
}