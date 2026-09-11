class Solution {
    public int smallestAbsent(int[] nums) {
        int sum=0;

        Set<Integer> set=new HashSet<>();
        for(int num: nums){
            sum+=num;
            set.add(num);
        }

        float avg=sum/nums.length;
        int from=Math.floor(avg)==(int)avg?(int)avg+1:(int)avg;
        while(from<=0 || set.contains(from)){
            from++;
        }

        return from;
    }
}