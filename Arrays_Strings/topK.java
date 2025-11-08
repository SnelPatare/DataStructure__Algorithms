package Arrays_Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class topK {
    public int[] topKFrequent(int[] nums, int k) {

        // Map<Integer, Integer> count = new HashMap<>();
        // for(int n:nums){
        //     count.put(n,count.getOrDefault(n,0)+1);
        // }

        // List<int[]> arr = new ArrayList<>();
        // for(Map.Entry<Integer, Integer> entry: count.entrySet()){
        //     arr.add(new int[] {entry.getValue(), entry.getKey()});
        // }
        // arr.sort((a,b) -> b[0] -a[0]);

        // int res[] = new int[k];
        // for(int i =0; i<k;i++){
        //     res[i] = arr.get(i)[1];
        // }
        // return res;


        // Map<Integer, Integer> count = new HashMap<>();
        // for(int n:nums){
        //     count.put(n, 1+count.getOrDefault(n,0));
        // }
        // PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        // for(Map.Entry<Integer, Integer> entry: count.entrySet()){
        //     heap.offer(new int[]{entry.getValue(), entry.getKey()});
        //     if(heap.size()>k){
        //         heap.poll();
        //     }
        // }

        // int[] res = new int[k];
        // for (int i =0; i<k;i++){
        //     res[i] = heap.poll()[1];
        // }
        // return res;

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];

        for (int i=0; i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int n:nums){
            count.put(n,1+count.getOrDefault(n,0));
        }

        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index= 0;
        for (int i=freq.length-1; i>0 && index<k;i--){
            for(int n:freq[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,4,5};
        int k =2;

        topK obj = new topK();
        int[] res = obj.topKFrequent(nums,k);
        System.out.println(Arrays.toString(res));


    }
    
}
