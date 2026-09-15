class Solution {
    public int[] decimalRepresentation(int n) {
        int coeff=1;
        List<Integer> list=new ArrayList<>();
        while(n>0){
            int rem=n%10;
            if(rem>0) list.add(rem*coeff);
            n/=10;
            coeff*=10;
        }
        int[] res=new int[list.size()];
        for(int i=0; i<res.length; i++){
            res[i]=list.get(res.length-i-1);
        }
        return res;
    }
}