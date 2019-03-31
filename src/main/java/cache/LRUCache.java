package cache;

import java.util.LinkedList;
import java.util.List;

public class LRUCache {

    private List<Integer> storage;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        storage = new LinkedList<>();
    }

}
