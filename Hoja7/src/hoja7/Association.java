<<<<<<< HEAD

import java.util.Map;




public class Association<K extends Comparable<K>,V> implements Map.Entry<K,V>
{


    protected K key; 
  
    protected V value; 

//hace la asociacion de terminos
    public Association(K key, V value)
    {
        assert (key != null);
        key = key;
        value = value;
    }


    public Association(K key)
    {
        this(key,null);
    }

 
    public boolean equals(Object other)
    {
        Association otherAssoc = (Association)other;
        return getKey().equals(otherAssoc.getKey());
    }
    
    
    public int hashCode()
    {
        return getKey().hashCode();
    }
    
  
    public V getValue()
    {
        return value;
    }

  
    public K getKey()
    {
        return key;
    }
    public V setValue(V value)
    {
        V oldValue = value;
        value = value;
        return oldValue;
    }

    
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append(" - "+getKey()+": "+getValue()+"\n");
        return s.toString();
    }

    public int compareTo(K key){
        return this.key.compareTo(key);
    }

}
=======
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
>>>>>>> 6305834143148df3f1e1445a94792bbc7b3cd9e4
