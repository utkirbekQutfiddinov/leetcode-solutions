class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res=new ArrayList<>();
        int i=num.length-1, rem=0;
        while(i>=0){
            rem=rem+num[i]+k%10;
            res.add(0,rem%10);
            rem/=10;
            k/=10;
            i--;
        }

        while(k>0){
            rem=rem+k%10;
            res.add(0,rem%10);
            rem/=10;
            k/=10;
        }
        if(rem>0){
            res.add(0,rem);
        }
        return res;
    }
}