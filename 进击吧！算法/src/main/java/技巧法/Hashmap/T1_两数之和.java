package 技巧法.Hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T1_两数之和 {
    /*public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i <nums.length ; i++) {
            hashMap.put(i,nums[i]);
            }


        }

    }*/



    public static void main(String[] args) {
        int target=6;
        int[] nums = new int[2];
        int[] index = new int[2];
        nums[0]=3;
        nums[1]=3;
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i <nums.length ; i++) {
            if (hashMap.containsKey(nums[i])) {
                index[1]=i;
                index[0]=hashMap.get(nums[i]);
            }
            hashMap.put(target-nums[i],i);
        }
        System.out.println(Arrays.toString(index));
    }
}
