class Solution {
    public int minOperations(int[] nums, int x) {
        Map<Integer, Integer> left=new HashMap<>(), right=new HashMap<>();
        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(!left.containsKey(sum))
                left.put(sum, i+1);

            if(sum==x)
            min=Math.min(min, i+1);
        }

        sum=0;
        for(int i=nums.length-1; i>=0; i--){
            sum+=nums[i];
            if(!right.containsKey(sum))
                right.put(sum, nums.length-i);

                
            if(sum==x)
            min=Math.min(min, nums.length-i);
        }

        sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(right.containsKey(x-sum)){
                min=Math.min(min, i+1+right.get(x-sum));
            }
        }
        
        sum=0;
        for(int i=nums.length-1; i>=0; i--){
            sum+=nums[i];
            if(left.containsKey(x-sum)){
                min=Math.min(min, nums.length-i+left.get(x-sum));
            }
        }

        if(min==Integer.MAX_VALUE){
            min=-1;
        }

        if(min>nums.length){
            min=-1;
        }
        return min;
    }
}