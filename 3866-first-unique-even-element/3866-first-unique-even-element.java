class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> freqs=new HashMap<>();
        for(int num: nums){
            freqs.merge(num, 1, Integer::sum);
        }
        for(int num: nums){
            if(num%2==0 && freqs.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}