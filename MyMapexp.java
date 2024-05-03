// import java.util.*;



// public class MyMapexp implements Map {

//     private HashMap<Object, Object> hashMap;
//     public MyMapexp(){
//         hashMap = new HashMap<>();
//     }

//     @Override
//     public Object put(Object key, Object value){
//         return hashMap.put(key, value);
//     }

//     @Override
//     public Object get(Object key){
//         return hashMap.get(key);
//     }

//     @Override
//     public Object remove(Object key){
//         return hashMap.remove(key);
//     }

//     @Override
//     public boolean containsKey(Object key){
//         return hashMap.containsKey(key);
//     }
    
//     @Override
//     public boolean containsValue(Object value){
//         return hashMap.containsValue(value);
//     }

//     @Override
//     public int size(){
//         return hashMap.size();
//     }

//     @Override
//     public boolean isEmpty(){
//         return hashMap.isEmpty();
//     }

//     @Override
//     public void putAll(Map t){
//         //not implement in this example
//     }
    
//     @Override
//     public void clear(){
//         hashMap.clear();
//     }

//     //collection views
//     @Override
//     public Set keySet(){
//         return hashMap.keySet();
//     }

//     @Override
//     public Collection values(){
//         return hashMap.values();
//     }

//     @Override
//     public Set entrySet(){
//         return hashMap.entrySet();
//     }



//     public static void main(String[] args) {
        
//         MyMapexp map = new MyMapexp();

//         map.put("key1", "value1");
//         map.put("key2", "value2");
//         map.put("key3", "value3");

//         System.out.println("Value for key1: "+map.get("key1"));

//         map.remove("key2");

//         System.out.println("Contins key2: "+map.containsKey("key2"));

//         // getting the size of map
//         System.out.println("Size of the map: "+map.size());

//         map.clear();

//         //checking if the map is empty
//         System.out.println("Is the map empty? "+map.isEmpty());
 

//     }    
// }






import java.util.*;

public class MyMapexp implements Map {
private HashMap<Object, Object> hashMap;
public MyMapexp() {
hashMap = new HashMap<>();
}

@Override
public Object put(Object key, Object value) {
return hashMap.put(key, value);
}
@Override
public Object get(Object key) {
return hashMap.get(key);
}

@Override
public Object remove(Object key) {
return hashMap.remove(key);
}
@Override
public boolean containsKey(Object key) {
return hashMap.containsKey(key);
}

@Override
public boolean containsValue(Object value) {
return hashMap.containsValue(value);
}

@Override
public int size() {
return hashMap.size();
}

@Override
public boolean isEmpty() {
return hashMap.isEmpty();
}

@Override
public void putAll(Map t) {
// Not implemented for this example
}
@Override
public void clear() {
hashMap.clear();
}

// Collection Views

@Override
public Set keySet() {
return hashMap.keySet();
}

@Override
public Collection values() {
return hashMap.values();
}

@Override
public Set entrySet() {
return hashMap.entrySet();
}
public static void main(String[] args) {
MyMapexp map = new MyMapexp();
map.put("key1", "value1");
map.put("key2", "value2");
map.put("key3", "value3");

System.out.println("Value for key1: " + map.get("key1"));

map.remove("key2");

System.out.println("Contains key2: " + map.containsKey("key2"));

// Getting the size of the map
System.out.println("Size of the map: " + map.size());

map.clear();

// Checking if the map is empty
System.out.println("Is the map empty? " + map.isEmpty());
}
}








