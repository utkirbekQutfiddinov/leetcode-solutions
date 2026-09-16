class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> res=new ArrayList<>();

        int leftMax=Integer.MIN_VALUE;
        int lastIndex=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>leftMax){
                leftMax=nums[i];
                res.add(leftMax);
                lastIndex=i;
            }
        }
        System.out.println(res);

        int index=res.size();
        int rightMax=Integer.MIN_VALUE;
        for(int i=nums.length-1; i>lastIndex; i--){
            if(nums[i]>rightMax){
                rightMax=nums[i];
                res.add(index,rightMax);
            }
        }
        return res;
    }
}