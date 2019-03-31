package cache;

import java.util.LinkedList;
import java.util.List;

public class LRUCache<T> {

    private List<T> storage;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        storage = new LinkedList<T>();
    }

}
