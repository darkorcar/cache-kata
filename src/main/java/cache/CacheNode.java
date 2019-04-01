package cache;

import java.util.ArrayList;
import java.util.Objects;

public class CacheNode {

    private CacheNode prev;
    private CacheNode next;
    private Integer element;
    private Integer key;
    private ArrayList a;

    public CacheNode(CacheNode prev, CacheNode next, Integer element, Integer key) {
        this.prev = prev;
        this.next = next;
        this.element = element;
        this.key = key;
    }

    public CacheNode getPrev() {
        return prev;
    }

    public CacheNode getNext() {
        return next;
    }

    public Integer getElement() {
        return element;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public void setPrev(CacheNode prev) {
        this.prev = prev;
    }

    public void setNext(CacheNode next) {
        this.next = next;
    }

    public void setElement(Integer element) {
        this.element = element;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CacheNode cacheNode = (CacheNode) o;
        return Objects.equals(element, cacheNode.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }
}
