package org.example;

import java.util.*;

public class MapPlayGround {

    Map<T, V> hashMap = new HashMap<T, V>();
    Map<T, V> linkedHashMap = new LinkedHashMap<T, V>();
    Map<T, V> sortedMap = new SortedMap<T, V>();
    Map<T, V> treeMap = new TreeMap<T, V>();

    public Map<T, V> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<T, V> hashMap) {
        this.hashMap = hashMap;
    }

    public Map<T, V> getLinkedHashMap() {
        return linkedHashMap;
    }

    public void setLinkedHashMap(Map<T, V> linkedHashMap) {
        this.linkedHashMap = linkedHashMap;
    }

    public Map<T, V> getSortedMap() {
        return sortedMap;
    }

    public void setSortedMap(Map<T, V> sortedMap) {
        this.sortedMap = sortedMap;
    }

    public Map<T, V> getTreeMap() {
        return treeMap;
    }

    public void setTreeMap(Map<T, V> treeMap) {
        this.treeMap = treeMap;
    }


}
