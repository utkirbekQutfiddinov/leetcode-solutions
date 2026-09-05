class Solution {
    public String concatHex36(int n) {
        int d=n*n, t=n*n*n;
        StringBuilder sb=new StringBuilder();
        while(t>0){
            sb.insert(0,getChar(t%36));
            t/=36;
        }
        while(d>0){
            sb.insert(0,getChar(d%16));
            d/=16;
        }
        return sb.toString();
    }

    private String getChar(int num){
        if(num<10) return ""+num;
        else return ""+(char)(num+55);
    }
}