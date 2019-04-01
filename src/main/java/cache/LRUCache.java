package cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private CacheNode firstNode;
    private CacheNode lastNode;
    private Map<Integer, CacheNode> index;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        firstNode = null;
        lastNode = null;
        index = new HashMap<>();
    }

    public int get(int key) {
        var lastRetrievedNode = index.get(key);

        if (lastRetrievedNode != null) {
            var prev = lastRetrievedNode.getPrev();
            var next = lastRetrievedNode.getNext();

            firstNode.setPrev(lastRetrievedNode);

            if (lastNode == lastRetrievedNode){
                lastNode = lastRetrievedNode.getPrev();
            }

            if (prev != null) {
                prev.setNext(next);
            }

            if (next != null) {
                next.setPrev(prev);
            }

            lastRetrievedNode.setPrev(null);
            lastRetrievedNode.setNext(firstNode);

            return lastRetrievedNode.getElement();

        }

        return -1;
    }

    public void set(int key, int value) {


        var element = index.get(key);

        if (element != null) {
            element.setElement(value);
            this.get(key);
        } else {

            if (capacity == this.size()) {

                if (lastNode != null) {
                    var prev = lastNode.getPrev();
                    if (prev != null) {
                        prev.setNext(null);
                    }

                    index.remove(lastNode.getKey());

                    lastNode = lastNode.getPrev();
                }

            }

            var newFirst = new CacheNode(null, firstNode, value, key);

            if (firstNode != null) {
                firstNode.setPrev(newFirst);
            } else {
                lastNode = newFirst;
            }

            firstNode = newFirst;

            index.put(key, newFirst);
        }
    }

    public int size() {
        return index.size();
    }
}
