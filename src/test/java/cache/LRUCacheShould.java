package cache;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheShould {

    @Test
    public void initialise() {
        LRUCache cache = new LRUCache(2);
    }

    @Test
    public void return_minus_one_if_key_does_not_exists() {
        LRUCache cache = new LRUCache(2);
        assertEquals(-1, cache.get(1));
    }

    @Test
    public void insert_the_value() {
        LRUCache cache = new LRUCache(2);

        cache.set(1, 10);

        assertEquals(10, cache.get(1));
    }

    @Test
    public void set_the_value_when_key_already_exists() {
        LRUCache cache = new LRUCache(2);

        cache.set(1, 10);
        assertEquals(10, cache.get(1));

        cache.set(1, 20);
        assertEquals(20, cache.get(1));

        assertEquals(1, cache.size());
    }

//    @Test
//    public void update_least_recently_used_element() {
//
//    }


    @Test
    public void have_capacity_limit() {
        LRUCache cache = new LRUCache(2);

        cache.set(0, 1);
        cache.set(1, 10);
        cache.set(2, 100);

        assertEquals(2, cache.size());
    }

    @Test
    public void evict_least_recently_accessed_element_on_capacity_reached() {
        LRUCache cache = new LRUCache(2);

        cache.set(0, 1);
        cache.set(1, 10);
        cache.set(2, 100);

        assertEquals(-1, cache.get(0));
        assertEquals(10, cache.get(1));
        assertEquals(100, cache.get(2));
    }

    @Test
    public void evict_least_recently_accessed_element_on_capacity_reached_v2() {
        LRUCache cache = new LRUCache(2);

        cache.set(0, 1);
        cache.set(1, 10);
        cache.get(0);
        cache.set(2, 100);

        assertEquals(-1, cache.get(1));
        assertEquals(1, cache.get(0));
        assertEquals(100, cache.get(2));
    }
}
