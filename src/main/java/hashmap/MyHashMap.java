package src.main.java.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MyHashMap<K, V> {
    private static final int INITIAL_SIZE = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashtable;

    public MyHashMap() {
        hashtable = new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int capacity) {

        int tableSize = tableSizeFor(capacity);
        hashtable = new Entry[tableSize];
    }

    final int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


    static class Entry<K, V> {
        public K key;
        public V value;
        public Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
