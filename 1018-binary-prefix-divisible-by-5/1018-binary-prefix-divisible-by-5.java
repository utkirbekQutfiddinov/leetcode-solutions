class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int num=0;
        List<Boolean> res=new ArrayList<>();

        for(int i: nums){
            num=(num*2+i)%5;
            res.add(num%5==0);
        }

        return res;
    }
}