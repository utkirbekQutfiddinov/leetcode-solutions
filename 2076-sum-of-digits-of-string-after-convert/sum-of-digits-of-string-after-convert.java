class Solution {
    public int getLucky(String s, int k) {
        s=convert(s);

        int res=transform(s);

        for(int i=0; i<k-1; i++){
            res=transform(res);
        }

        return res;
    }


    private String convert(String str){
        StringBuilder sb=new StringBuilder("");
        int son=0;

        for(char c: str.toCharArray()){
            son=c-'a'+1;
            sb.append(""+son);
        }

        return sb.toString();
    }

    private int transform(String str){
        int sum=0;

        for(char c: str.toCharArray()){
            sum+=c-'0';
        }

        return sum;
    }

    private int transform(int son){
        int sum=0;

        while(son!=0){
            sum+=son%10;
            son/=10;
        }
        return sum;
    }
}