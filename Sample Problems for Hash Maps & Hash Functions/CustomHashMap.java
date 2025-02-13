import java.util.*;
 class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    
    private LinkedList<Entry<K, V>>[] bucketArray;
    private int size;

    public CustomHashMap() {
        bucketArray = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % bucketArray.length);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (bucketArray[index] == null) {
            bucketArray[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : bucketArray[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucketArray[index].add(new Entry<>(key, value));
        size++;

        if ((float) size / bucketArray.length > LOAD_FACTOR) {
            resize();
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        if (bucketArray[index] != null) {
            for (Entry<K, V> entry : bucketArray[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        if (bucketArray[index] != null) {
            Iterator<Entry<K, V>> iterator = bucketArray[index].iterator();
            while (iterator.hasNext()) {
                if (iterator.next().key.equals(key)) {
                    iterator.remove();
                    size--;
                    return;
                }
            }
        }
    }

    private void resize() {
        LinkedList<Entry<K, V>>[] oldBucketArray = bucketArray;
        bucketArray = new LinkedList[oldBucketArray.length * 2];
        size = 0;

        for (LinkedList<Entry<K, V>> bucket : oldBucketArray) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    put(entry.key, entry.value);
                }
            }
        }
    }

    public int size() {
        return size;
    }

    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        System.out.println("Value for 'two': " + map.get("two"));
        map.remove("two");
        System.out.println("Value for 'two' after removal: " + map.get("two"));
        System.out.println("Current size: " + map.size());
    }
}
