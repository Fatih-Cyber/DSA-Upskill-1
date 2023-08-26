package review_sort;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int size;
    int capacity;
    HashMap<Integer,DNode> cacheMap=new HashMap<>();
    DNode head;
    DNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size=0;
        this.head=new DNode();
        this.tail=new DNode();
        head.next=tail;
        tail.prev=head;
    }
    public void addNode(DNode node){
        node.prev=head;
        node.next=head.next;

        head.next.prev=node;
        head.next=node;
    }
    public void removeNode(DNode node){
        DNode prevNode=node.prev;
        DNode nextNode=node.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
    public void moveToFirst(DNode node){
        removeNode(node);
        addNode(node);
    }
    public DNode popLast(){
        DNode popped=tail.prev;
        removeNode(popped);
        return popped;
    }
    public int get(int key){
        //Go and check hashmap if you have the key
        DNode node= cacheMap.get(key);
        // return -1 if you dont have this key
        if(node==null) return -1;
        else {
            moveToFirst(node);// make it recent
            return node.value;// return value of node
        }
    }
    public void put(int key, int value){
        //Go and check hashmap if you have the key
        DNode node= cacheMap.get(key);
        if(node==null) { // if I dont have this key in my lru
            DNode newNode=new DNode(key,value);
            cacheMap.put(key, newNode); // put in hashmap
            addNode(newNode); // put in linkedlist
            size++;
            if (size>capacity){
                DNode last=popLast();// remove from the linkedlist
                cacheMap.remove(last.key);
                size--;
            }
        }else {  // I  have this key in my lru
            node.value=value; // update the value
            moveToFirst(node);// make it recent

        }
    }
    void printLRU(){
        for(Map.Entry<Integer,DNode> entry:cacheMap.entrySet()){
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }
    }

}
