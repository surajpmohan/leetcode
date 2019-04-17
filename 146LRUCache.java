class LRUCache {

      private int capacity = 0;
    private LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<Integer, Integer>();

    private int count = 0;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        
        if (hashMap.containsKey(key)) {
           int value = hashMap.get(key);
           this.put(key, value);
            return value;
        } else {
            return -1;
        }
       // return value;
    }
    
    public void put(int key, int value) {
        if (hashMap.containsKey(key)) {
            hashMap.remove(key);
        } else if (hashMap.size()==capacity){
            Iterator it = hashMap.keySet().iterator();
            it.next();
            it.remove();    
        }
        hashMap.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
