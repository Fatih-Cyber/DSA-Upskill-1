package Review5_Queues_Hashing;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
   public List<Bucket> hashMap;
   public int modNumber;


    public MyHashMap() {
      this.modNumber=2341;
        for (int i = 0; i < 2341; i++) {
            this.hashMap.add(new Bucket());
        }

    }

    public void put(int key, int value) {
           // calculate index address with modulus
           int hashCode =key%modNumber;// I have an index
           this.hashMap.get(hashCode).update(key,value);
    }

    public int get(int key) {
        return 0;
    }

    public void remove(int key) {

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
