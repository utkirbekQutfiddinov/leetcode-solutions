class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> nums=new HashSet<>();

        for(int i=0; i<ranges.length; i++){
            for(int j=ranges[i][0]; j<=ranges[i][1]; j++){
                nums.add(j);
            }
        }

        for(int i=left; i<=right; i++){
            if(!nums.contains(i)){
                return false;
            }
        }
        return true;

    }
}