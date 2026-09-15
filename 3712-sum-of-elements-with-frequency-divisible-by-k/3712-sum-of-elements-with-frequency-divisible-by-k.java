class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> freqs=new HashMap<>();
        for(int num: nums){
            freqs.merge(num,1,Integer::sum);
        }

        int sum=0;
        for(Map.Entry<Integer, Integer> entry: freqs.entrySet()){
            if(entry.getValue()%k==0){
                sum+=entry.getKey()*entry.getValue();
            }
        }
        return sum;
    }
}