class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> aset=new HashSet<>(), bset=new HashSet<>();
        int asum=0, bsum=0;

        for(int i: aliceSizes){
            aset.add(i);
            asum+=i;
        }

        for(int i: bobSizes){
            bset.add(i);
            bsum+=i;
        }


        int diff=0;
        if(asum>bsum){
            diff=(asum-bsum)/2;

            for(int i: bobSizes){
                if(aset.contains(i+diff)){
                    return new int[]{i+diff,i};
                }
            }
        }else {
            diff=(bsum-asum)/2;

            for(int i: aliceSizes){
                if(bset.contains(i+diff)){
                    return new int[]{i,i+diff};
                }
            }
        }

        return null;
    }
}