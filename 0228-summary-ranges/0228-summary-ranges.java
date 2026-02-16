class Solution {
    public List<String> summaryRanges(int[] nums) {

        if(nums==null || nums.length==0){
            return List.of();
        }

        List<String> result=new ArrayList<>();

        int start=nums[0], last=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]>last+1){
                if(start<last){
                    result.add(start+"->"+last);
                }else {
                    result.add(""+start);
                }
                start=nums[i];
            }
            last=nums[i];
        }

        if(start<last){
            result.add(start+"->"+last);
        }else {
            result.add(""+start);
        }
            
        return result;

    }
}