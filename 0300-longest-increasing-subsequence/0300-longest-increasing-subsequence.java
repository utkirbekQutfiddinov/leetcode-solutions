class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails=new int[nums.length];
        int size=0;

        for(int num: nums){
            int ind=Arrays.binarySearch(tails,0,size,num);
            if(ind<0){
                ind=ind*-1-1;
            }
            tails[ind] = num;
            if (ind == size){
                size++;
            } 
        }
        return size;
    }
}