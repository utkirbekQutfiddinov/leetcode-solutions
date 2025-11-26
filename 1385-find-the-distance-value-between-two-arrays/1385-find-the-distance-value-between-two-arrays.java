class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Set<Integer> nums=new HashSet<>();

        for(int i: arr2){
            nums.add(i);
        }

        int res=0;

        for(int i: arr1){
            if(check(i,d,nums)){
                res++;
            }
        }

        return res;
    }

    boolean check(int i, int distance, Set<Integer> nums){
        for(int j: nums){
            if(Math.abs(i-j)<=distance){
                return false;
            }
        }
        return true;
    }
}