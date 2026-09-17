class Solution {
    public int maxDigitRange(int[] nums) {
        Map<Integer, List<Integer>> map=new HashMap<>();//<digit range, nums>

        int maxRange=0;
        for(int num: nums){
            int range=getRange(num);
            maxRange=Math.max(range,maxRange);
            List<Integer> list=map.getOrDefault(range, new ArrayList<>());
            list.add(num);
            map.put(range,list);
        }
        List<Integer> list=map.get(maxRange);
        int sum=0;
        for(int num: list){
            sum+=num;
        }
        return sum;
    }

    private int getRange(int num){
        int minDigit=num%10, maxDigit=num%10;
        while(num>0){
            int rem=num%10;
            if(rem<minDigit){
                minDigit=rem;
            }
            if(rem>maxDigit){
                maxDigit=rem;
            }
            num/=10;
        }
        return maxDigit-minDigit;
    }
}