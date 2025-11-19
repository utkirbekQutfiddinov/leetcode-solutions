class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> numSet=new HashSet<>();

        for(int i: nums){
            numSet.add(i);
        }

        while(numSet.contains(original)){
            original*=2;
        }

        return original;

    }
}