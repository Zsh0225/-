package 技巧法.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T594最长和谐子序列 {
    public static void main(String[] args) {

        int[] nums = new int[7];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 2;
        nums[3] = 2;
        nums[4] = 5;
        nums[5] = 2;
        nums[6] = 3;
        int longest = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            } else map.put(nums[i], 1);
        }
        Set<Integer> integers = map.keySet();
        for (Integer ii : integers) {
            if (map.containsKey(ii + 1)) {
                longest = Math.max(longest, map.get(ii) + map.get(ii + 1));
            }

        }
        System.out.println(longest);

    }
}
