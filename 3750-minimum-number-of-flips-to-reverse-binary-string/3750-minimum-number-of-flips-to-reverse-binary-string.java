class Solution {
    public int minimumFlips(int n) {
        StringBuilder sb=new StringBuilder("");
        while(n>0){
            sb.insert(0,n%2);
            n/=2;
        }

        char[] c1=sb.toString().toCharArray();
        char[] c2=sb.reverse().toString().toCharArray();

        int res=0;

        for(int i=0; i<c1.length; i++){
            if(c1[i]!=c2[i]){
                res++;
            }
        }

        return res;
    }
}