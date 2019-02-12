package com.company.simplemap;

public class SimpleMap<K, V> implements Map<K, V> {
    Entry[] entries;
    int n = 0;

    public SimpleMap(int size) {
        entries = new Entry[size];
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < n; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        entries[n] = newEntry;
        n++;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < n; i++) {
            if (entries[i].key.equals(key)) {
                return (V) entries[i].value;
            }
        }
        return null;
    }

    class Entry<A, B> {
        A key;
        B value;

        public Entry(A key, B value) {
            this.key = key;
            this.value = value;
        }
    }
}
