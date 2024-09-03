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
        int son;

        for(char c: str.toCharArray()){
            son=c-'a';
            sb.append(son+1);
        }
        return sb.toString();
    }

    private int transform(String str){
        int sum=0;

        for(char c: str.toCharArray()){
            sum=sum+(int)c-48;
        }

        return sum;
    }

    private int transform(int num){
        int sum=0;

        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}