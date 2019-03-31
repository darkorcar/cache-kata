package cache;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheShould {

    @Test
    public void initialise() {
        LRUCache cache = new LRUCache();
    }

    @Test
    public void return_minus_one_if_key_does_not_exists() {
        LRUCache cache = new LRUCache();
        assertEquals(-1, cache.get(1));
    }

    @Test
    public void insert_the_value() {
        LRUCache cache = new LRUCache();

        cache.set(1, 10);

        assertEquals(10, cache.get(1));
    }
}
