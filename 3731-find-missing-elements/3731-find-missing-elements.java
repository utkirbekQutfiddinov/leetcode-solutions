class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0], max=nums[0];
        Set<Integer> set=new HashSet<>();
        List<Integer> result=new ArrayList<>();

        for(int num: nums){
            set.add(num);
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }

        for(int i=min; i<=max; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        
        return result;
    }
}