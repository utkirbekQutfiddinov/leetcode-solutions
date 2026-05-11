class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> resList=new ArrayList<>();

        for(int i=nums.length-1; i>=0; i--){
            while(nums[i]>0){
                resList.add(0,nums[i]%10);
                nums[i]/=10;
            }
        }

        int[] res=new int[resList.size()];

        for(int i=0; i<resList.size(); i++){
            res[i]=resList.get(i);
        }
        return res;
    }
}