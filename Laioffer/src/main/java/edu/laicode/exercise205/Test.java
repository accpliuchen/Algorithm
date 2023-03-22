package edu.laicode.exercise205;

import java.util.HashMap;
import java.util.Map;

class Solution<K, V> {
    // limit is the max capacity of the cache
    static class Node<K, V> {
        Node<K, V> prev;
        Node<K, V> next;
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        void update(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int limit;
    private Node<K, V> head;
    private Node<K, V> tail;
    private Map<K, Node<K, V>> map;
    // limit is the max capacity of the cache
    public Solution(int limit) {
        this.limit = limit;
        this.map = new HashMap<>();
    }

    public void set(K key, V value) {
        Node<K, V> node = null;

        if (map.containsKey(key)) {
            node = map.get(key);
            node.value = value;
            remove(node);
        }
        else if (map.size() < limit) {
            node = new Node<>(key, value);
        }
        else {
            node = tail;
            remove(node);
            node.update(key, value);
        }

        append(node);
    }

    public V get(K key) {
        Node<K, V> node = map.get(key);

        if (node == null) {
            return null;
        }

        remove(node);
        append(node);

        return node.value;
    }

    private Node<K, V> remove(Node<K, V> node) {
        map.remove(node.key);

        if (node.prev != null) {
            node.prev.next = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }

        if (node == head) {
            head = head.next;
        }

        if (node == tail) {
            tail = tail.prev;
        }

        node.next = null;
        node.prev = null;

        return node;
    }

    private Node<K, V> append(Node<K, V> node) {
        map.put(node.key, node);

        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head.prev = node;
            head = node;
        }

        return node;
    }
}

public class Test {

    public static void main(String args[]){

        Solution lRUCache = new Solution(2);
        lRUCache.set(1, 1); // cache is {1=1}
        lRUCache.set(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.set(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.set(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4


        System.out.println("====");

    }
}
