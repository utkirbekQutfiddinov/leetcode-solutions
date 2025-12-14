class MyHashSet {

    boolean[] table;

    public MyHashSet() {
        table=new boolean[1000001];
    }
    
    public void add(int key) {
        table[key]=true;
    }
    
    public void remove(int key) {
        table[key]=false;
    }
    
    public boolean contains(int key) {
        return table[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */