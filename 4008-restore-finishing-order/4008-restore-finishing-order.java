class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendsSet=new HashSet<>();

        for(int i: friends){
            friendsSet.add(i);
        }

        int[] res=new int[friends.length];

        int index=0;

        for(int i: order){
            if(friendsSet.contains(i)){
                res[index++]=i;
            }
        }

        return res;
    }
}