class Solution {
    public int myAtoi(String s) {
        s=s.trim();

        boolean manfiymi=false;

        if(s.startsWith("+")){
            s=s.substring(1);
        } else if(s.startsWith("-")){
            manfiymi=true;
            s=s.substring(1);
        }

        long num=0;

        for(char c: s.toCharArray()){
            if(c>='0' && c<='9'){
                num=num*10+(int)c-48;

                if(!manfiymi && num>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }else if(manfiymi && -1*num<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }

            }else {
                break;
            }
        }

        if(manfiymi){
            return (int) num*-1;
        }else {
            return (int)num;
        }

    }
}