class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smallers=0, targets=0;
        for(int num: nums){
            if(num<target) smallers++;
            else if(num==target) targets++;
        }

        return Stream.iterate(smallers,i -> i + 1).limit(targets).toList();
    }
}