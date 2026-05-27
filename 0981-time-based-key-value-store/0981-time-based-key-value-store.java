class TimeMap {
    Map<String,List<Node>> map;

    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Node> list=map.getOrDefault(key,new ArrayList<>());
        list.add(new Node(value,timestamp));
        map.put(key,list);
    }
    
public String get(String key, int ts) {
    List<Node> list = map.get(key);
    if (list == null) return "";

    int left = 0, right = list.size() - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (list.get(mid).timestamp == ts) return list.get(mid).value;
        else if (list.get(mid).timestamp < ts) left = mid + 1;
        else right = mid - 1;
    }

    return right >= 0 ? list.get(right).value : "";
}

    class Node{
        String value;
        int timestamp;
        public Node(String value, int time){
            this.value=value;
            this.timestamp=time;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */