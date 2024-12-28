import java.util.*;

public class Twosum {
    public static List<List<Integer>> twoSums(int[] nums, int sum) {
        List<List<Integer>> twoSums = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == sum) {
                    List<Integer> sortedAnswers = Arrays.asList(nums[i], nums[j]);
                    Collections.sort(sortedAnswers);
                    if (!twoSums.contains(sortedAnswers)) {
                        twoSums.add(sortedAnswers);
                    }
                }
            }
        }
        return twoSums;
    }


    public static void main(String[] args) {
        int[] nums = { 1,3,5,4,2,6,7,8,9};
        int sum = 9;
       
       System.out.println(twoSums(nums, sum));
}
}
