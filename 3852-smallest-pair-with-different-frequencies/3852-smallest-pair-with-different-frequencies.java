class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer, Integer> freqs=new HashMap<>();
        //har bir sonning chastotasini topvolamiz
        for(int num: nums){
            freqs.merge(num, 1, Integer::sum);
        }

        System.out.println("freqs: " + freqs);

        //chastotasi bir xil bo'lgan sonlarni guruhlaymiz
        Map<Integer, List<Integer>> groups=new HashMap<>();
        for(int num: freqs.keySet()){
            int freq=freqs.get(num);
            List<Integer> group=groups.getOrDefault(freq,new ArrayList<>());
            group.add(num);
            groups.put(freq, group);
        }
        
        System.out.println("groups: " + groups);
        if(groups.size()<2) return new int[]{-1,-1};

        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;

        //har bir chastota guruhi bo'yicha eng kichik sonlardan ikkitasi topamiz
        for(int freq: groups.keySet()){
            List<Integer> group=groups.get(freq);

            int num=group.get(0);

            //shu chastota guruhi ichidagi eng kichik sonni topamiz
            for(int el: group){
                if(el<num){
                    num=el;
                }
            }

            //topilgan eng kichik son min1 yki min2 bilan solishtiriladi
            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }
        System.out.println("min1: " + min1+", min2: "+min2);
        if(min1<min2){
            return new int[]{min1,min2};
        }else {
            return new int[]{min2,min1};
        }
    }
}