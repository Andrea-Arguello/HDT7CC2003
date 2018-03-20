/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja7;

import java.util.Map;

/**
 *
 * @author cooli
 */
public class Association<K,V> implements Map.Entry<K,V>{
    protected K key;
    protected V value;
    
    public Association(K key, V value){
        this.key=key;
        this.value=value;
    }
    
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V val) {
        this.value=val;
        return value;
    }
    
    
}
