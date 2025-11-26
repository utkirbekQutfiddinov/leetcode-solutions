class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> nums=new HashSet<>();

        for(int i: arr){
            if(nums.contains(2*i) ||(i%2==0 && nums.contains(i/2))){
                return true;
            }
            nums.add(i);
        }

        return false;
    }
}