class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        List<Integer> list=new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(list.isEmpty() || nums[i]!=list.get(list.size()-1)){
                list.add(nums[i]);
            }
            map.merge(nums[i],1,Integer::sum);    
        }
        List<Integer> res=new ArrayList<>();

        for(Integer num: list){
            Integer freq=map.get(num);
            for(int i=0; i<k && i<freq; i++){
                res.add(num);
            }
        }
        
        int[] arr=new int[res.size()];
        for(int i=0; i<arr.length; i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}