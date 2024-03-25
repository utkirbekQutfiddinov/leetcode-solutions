class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        
        for(int i: nums){
            if(set.contains(i)){
                set.remove(i);
            }else {
                set.add(i);
            }
        }
        
        Set<Integer> res = Arrays.stream(nums)
                                  .boxed()
                                  .collect(Collectors.toSet());
        
        res.removeAll(set);
        
        return new ArrayList<Integer>(res);
    }
}