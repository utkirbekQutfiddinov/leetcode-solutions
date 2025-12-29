class Solution {
    public int findJudge(int n, int[][] trusts) {

        if(trusts.length==0 && n==1){
            return 1;
        }


        Map<Integer, Integer> trustersMap=new HashMap<>(), trustingMap=new HashMap<>();

        for(int[] trust: trusts){
            trustersMap.merge(trust[1],1, Integer::sum);
            trustingMap.merge(trust[0],1, Integer::sum);
        }

        for(Integer key: trustersMap.keySet()){
            if(trustersMap.get(key).equals(n-1) && !trustingMap.containsKey(key)){
                return key;
            }
        }

        return -1;
    }
}