package cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {

    private List<Integer> storage;
    private Map<Integer, Integer> index;

    public LRUCache() {
        storage = new LinkedList<>();
        index = new HashMap<>();
    }

    public int get(int key) {
        var i = index.get(key);

        return (i == null) ? -1 : storage.get(i);
    }

    public void set(int key, int value) {
        storage.add(0, value);
        index.put(key, 0);
    }
}
