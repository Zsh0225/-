package 技巧法.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class T217_存在重复元素 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                //return true;
            }
            set.add(nums[i]);
        }
      //  return false;

//方法二
        for (Integer ii:set) {
            set.add(ii);
          //  return res.size()<nums.length?true:false;
        }

    }
}
