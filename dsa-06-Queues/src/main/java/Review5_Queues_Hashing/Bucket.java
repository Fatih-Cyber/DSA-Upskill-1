package Review5_Queues_Hashing;

import java.util.LinkedList;

public class Bucket {
    LinkedList<KeyValue<Integer,Integer>>  bucket;

    public Bucket() {
        this.bucket = new LinkedList<KeyValue<Integer,Integer>>();
    }
    public void update(int key, int value){
        // if Key exists then update value part
        boolean found=false;
        for (KeyValue<Integer,Integer> pair:bucket) {
            if(pair.key.equals(key)) {
                pair.value=value;
                found=true;
            }

        }
        // else add key and value as a new pair
        if(!found) this.bucket.add(new KeyValue<>(key, value));
    }

}
