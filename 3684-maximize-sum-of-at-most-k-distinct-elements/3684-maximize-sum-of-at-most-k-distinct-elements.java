class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        int[] res=new int[k];
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=0 &&k>0; i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                res[res.length-k]=nums[i];
                k--;
            }
        }

        if(k>0){
            int[] result=new int[res.length-k];
            for(int i=0; i<result.length; i++){
                result[i]=res[i];
            }
            res=result;
        }

        return res;
    }
}