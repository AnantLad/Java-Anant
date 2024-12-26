package CollectionFramework;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

// Three sum problem : It finding all unique triplets of numbers in an array that sum up to given target. 
// two approches varity of sorting and hashing
// 1. Brute Force
public class ArrayList {
    public static List<List<Integer>> threeSums(int[] nums,int sum) {
            List<List<Integer>> threeSums = new java.util.ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == sum) {
                            List<Integer> sortedAnswer = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(sortedAnswer);
                            if (!threeSums.contains(sortedAnswer)) {
                                threeSums.add(sortedAnswer);
                            }
                        }
                    }
                }
            }
                    return threeSums;
        }
    public static void main(String[] args) {
        int[] nums = { 1,3,5,4,2,6,7,8,9};
        int sum = 9;
       
       System.out.println(threeSums(nums, sum));
}
}

// 2. Two Hashmap
// 3. Sorting, Iterating and Two point
