class RecentCounter {
    List<Integer> list;

    public RecentCounter() {
        list=new ArrayList<>();
    }
    
    public int ping(int t) {
        int count=0;
        list.add(t);
        int from=t-3000;

        for(int i=list.size()-1; i>=0; i--){
            if(list.get(i)>=from && list.get(i)<=t){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */