package cache;

import java.util.LinkedList;
import java.util.List;

public class LRUCache {

    private List<Integer> storage;

    public LRUCache() {
        storage = new LinkedList<>();
    }

    public int get(int key) {
        return -1;
    }
}
