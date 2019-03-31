package cache;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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

}
