package main.java.mapimplementation;

import java.util.ArrayList;
import java.util.List;

public class OurMap<K, V> {
    private List<MapNode<K,V>> bucket;
    private int capacity; //length of the bucket
    private int size; //number of elements in the map
    private final int INITIAL_CAPACITY = 5; //initial length of the bucket array

    public OurMap() {
        // Here, we are using List, not an array, because we are dealing with Generic types
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        /**
         * This bucket field is of type List. If we don't perform add() operation on the List,
         * in Java it would still remain of size 0.
         * Now, if hash function computes the hash code of the key and
         * gives the index that the key needs to go in the bucket list,
         * lets suppose hash function gives index as 2 where the key needs to be inserted in the bucket List
         * but if the bucket List is empty, we would run into exception as
         * ArrayIndexOutOfBoundsException, hence the below code is important to perform
         * add() operation on the bucket with null values
         */
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        //compression logic
        return Math.abs(hashCode) % capacity;
    }

    /**
     * Every Generic Type in Java is of type Object
     * == will just be comparing the memory address of these 2 values, not the actual values
     * For example, there are 2 custom objects, then we can't compare them using ==
     * as it will simply compare the memory addresses of these 2 objects and not the actual values
     */
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        while(head != null) {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return null;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        /**
         * In the while loop, we are iterating through LinkedList of nodes present in the map
         * If key for any LinkedList node  is equal to the key which needs to be inserted in the Map
         * then the value will be updated for the given key
         */
        MapNode<K, V> head = bucket.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
            }
            head = head.next;
        }
        //increment the number of elements in the Map
        size++;
        //Now, we have to simply add an element to the head of the LinkedList
        MapNode<K, V> newEntry = new MapNode<>(key, value);
        /**
         * Get the new head of the LinkedList by getting the index
         * since the previous head was exhausted as we iterated
         * through the LinkedList of nodes
         */
        head = bucket.get(bucketIndex);
        //insert at the starting position of the LinkedList
        newEntry.next = head;
        bucket.set(bucketIndex, newEntry);
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        while(head != null) {
            if (head.key.equals(key)) {
                bucket.remove(key);
            }
            head = head.next;
        }
    }

    private class MapNode<K,V> {
        K key;
        V value;
        MapNode<K,V> next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
