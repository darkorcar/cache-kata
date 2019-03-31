package cache;

import org.junit.Test;

public class LRUCacheShould {

    @Test
    public void initialise_with_capacity() {
        LRUCache cache = new LRUCache(3);
    }
    
}
