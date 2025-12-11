class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1=new HashMap<>(), map2=new HashMap<>();

        for(int i: nums1){
            map1.merge(i, 1, Integer::sum);
        }
        
         for(int i: nums2){
            map2.merge(i, 1, Integer::sum);
        }

        List<Integer> resultList=new ArrayList<>();

        for(int i: map1.keySet()){
            for(int j=0; j<Math.min(map1.get(i), map2.getOrDefault(i,0)); j++){
                resultList.add(i);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}