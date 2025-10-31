package core.basesyntax.impl;

import core.basesyntax.Storage;
import java.util.ArrayList;
import java.util.List;

public class StorageImpl<K, V> implements Storage<K, V> {
    private final List<K> keyList;
    private final List<V> valueList;

    public StorageImpl() {
        keyList = new ArrayList<>();
        valueList = new ArrayList<>();
    }

    @Override
    public void put(K key, V value) {
        if (!keyList.contains(key)) {
            keyList.add(key);
            valueList.add(value);
        } else {
            valueList.set(keyList.indexOf(key), value);
        }
    }

    @Override
    public V get(K key) {
        if (keyList.contains(key)) {
            return valueList.get(keyList.indexOf(key));
        }
        return null;
    }

    @Override
    public int size() {
        return keyList.size();
    }
}
