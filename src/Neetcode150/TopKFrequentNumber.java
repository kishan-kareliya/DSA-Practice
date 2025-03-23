package Neetcode150;

import java.util.*;

public class TopKFrequentNumber {
    public static void topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> numberFrequency = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];

        for(int num : nums){
            if(numberFrequency.containsKey(num)){
                numberFrequency.put(num,numberFrequency.get(num) + 1);
            }
            numberFrequency.putIfAbsent(num,1);
        }

        for(int key : numberFrequency.keySet()){
            int freq = numberFrequency.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] ans = new int[k];
        int pos = 0;

        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i] != null){
                for(int j=0;j < bucket[i].size() && pos < k;j++){
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    public static void main(String args[]){
        int[] numbers = {1,1,1,2,2,3,3,3,3,4,5,5,5,5,5,6,6,6};
        topKFrequent(numbers,2);
    }
}
