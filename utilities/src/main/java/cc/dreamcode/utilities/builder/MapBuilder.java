package cc.dreamcode.utilities.builder;

import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class MapBuilder<K, V> {

    private final Map<K, V> map = new HashMap<>();

    public MapBuilder<K, V> put(K k, V v) {
        this.map.put(k, v);
        return this;
    }

    public MapBuilder<K, V> put(K[] array, V v) {
        Arrays.stream(array).forEach(k -> this.put(k, v));
        return this;
    }

    public MapBuilder<K, V> putAll(@NonNull Map<? extends K, ? extends V> map) {
        this.map.putAll(map);
        return this;
    }

    public Map<K, V> build() {
        return this.map;
    }

}
