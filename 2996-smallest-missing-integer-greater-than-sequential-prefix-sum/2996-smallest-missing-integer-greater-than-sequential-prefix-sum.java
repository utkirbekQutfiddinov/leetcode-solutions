class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set=new HashSet<>();

        for(int i: nums){
            set.add(i);
        }

        int last=nums[0]-1;
        int sum=0;
        for(int i: nums){
            if(i!=last+1){
                break;
            }
            sum+=i;
            last++;
        }

        while(set.contains(sum)){
            sum++;
        }

        return sum;

    }
}