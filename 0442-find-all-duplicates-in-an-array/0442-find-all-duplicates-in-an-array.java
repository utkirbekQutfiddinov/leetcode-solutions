class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> nodups=new HashSet<>();
        
        for(int i: nums){
            if(nodups.contains(i)){
                nodups.remove(i);
            }else {
                nodups.add(i);
            }
        }
        
        Set<Integer> uniques=Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toSet());
        
        
        uniques.removeAll(nodups);
        
        return new ArrayList<Integer>(uniques);
    }
}