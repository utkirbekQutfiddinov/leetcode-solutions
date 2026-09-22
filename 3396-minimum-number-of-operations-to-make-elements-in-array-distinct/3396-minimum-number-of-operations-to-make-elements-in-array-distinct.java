class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int cnt=0;
        for(int i=nums.length-1; i>=0; i--){
            int num=nums[i];
            if(set.contains(num)){
                break;
            }
            set.add(num);
        }

        if((nums.length-set.size())%3==0){
            return (nums.length-set.size())/3;
        }else {
            return (nums.length-set.size())/3+1;
        }
    }
}