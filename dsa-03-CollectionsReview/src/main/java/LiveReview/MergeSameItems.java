package LiveReview;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MergeSameItems {
    public static void main(String[] args) {
       int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][]  items2 = {{3,1},{1,5}};
        List<List<Integer>> a= mergeSimilarItems(items1, items2);
        System.out.println(a);
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result=new ArrayList<>();
          // create a treemap
        TreeMap<Integer,Integer> map=new TreeMap<>();
          // add items1 into treemap
        for (int[] item : items1) {
            map.put(item[0],item[1]);
        }
          // add items 2 into treemap, if no entry then add item first than update it
        for (int[] item : items2) {
            map.putIfAbsent(item[0],0);
            map.put(item[0],map.get(item[0])+item[1]);
        }
          // go over the treemap add key and value(weight ) into a list and add list into result list
        for(var item:map.keySet()){
            List<Integer> row=new ArrayList<>();
            row.add(item);
            row.add(map.get(item));
            result.add(row);
        }

        return result;
    }
}
