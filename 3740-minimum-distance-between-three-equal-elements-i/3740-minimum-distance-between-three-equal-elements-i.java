class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> indices=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> ind=indices.getOrDefault(nums[i], new ArrayList<>());
            ind.add(i);
            indices.put(nums[i],ind);
        }

        int minDist=-1;
        boolean found=false;
        for(int num: indices.keySet()){
            List<Integer> ind=indices.get(num);
            if(ind.size()<3) continue;
            for(int i=0; i<ind.size()-2; i++){
                int dist=2*ind.get(i+2)-2*ind.get(i);
                if(!found){
                    found=true;
                    minDist=dist;
                }else if(dist<minDist){
                    minDist=dist;
                }
            }
        }
        if(!found){
            return -1;
        }
        return minDist;
    }
}