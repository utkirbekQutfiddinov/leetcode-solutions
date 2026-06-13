class LRUCache {
    private Node head, tail;
    private Map<Integer, Node> map;
    private int capacity; 

    public LRUCache(int capacity) {
        map=new HashMap<>();
        this.capacity=capacity; 
        head=new Node();
        tail=new Node();
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);    
        addFirst(node);
        return node.value;
    }
    
    public void put(int key, int value) {
    if (map.containsKey(key)) {
        Node node = map.get(key);
        node.value = value;
        remove(node);
        addFirst(node);
    } else {
        if (map.size() == capacity) {
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
        Node node = new Node(key, value);
        map.put(key, node);
        addFirst(node);
        }
    }

    private final void remove(Node node){
       node.prev.next=node.next;
       node.next.prev=node.prev;
    }

    private final void addFirst(Node node){
        node.next=head.next;
        node.prev=head;
        node.next.prev=node;
        head.next=node;
    }

    private class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node() {}
        Node(int key, int value) { this.key = key; this.value = value; }
    }
}