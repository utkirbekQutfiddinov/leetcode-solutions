class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int coeff=1;

        while(set.contains(k*coeff)){
            coeff++;
        }

        return k*coeff;
    }
}