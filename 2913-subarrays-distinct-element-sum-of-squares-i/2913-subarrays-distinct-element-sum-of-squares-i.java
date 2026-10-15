class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        Set<String> chars=new HashSet<>();
        for(int right=0; right<nums.size(); right++){
            for(int left=0; left<=right; left++){
                chars=new HashSet<>();
                for(int z=left; z<=right; z++){
                    chars.add(""+nums.get(z));
                }
                int size=chars.size();
                sum+=size*size;
            }
        }
        return sum;
    }
}