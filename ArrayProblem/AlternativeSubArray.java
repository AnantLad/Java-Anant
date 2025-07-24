public class AlternativeSubArray {

    public static  int alternatingSubarray(int[] nums) {
        int maxLen = -1;
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i + 1] - nums[i] == 1) {
                int length = 2;
                int j = i + 1;
                int sign = -1;

                while (j + 1 < nums.length && nums[j + 1] - nums[j] == sign) {
                    length++;
                    j++;
                    sign *= -1; // alternate +1 and -1
                }

                maxLen = Math.max(maxLen, length);
                i = j;          // move to next possible start point
            } else {
                i++;
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
         int[] nums = {2, 3, 2, 3, 2, 1, 4};  // You can change this input

        System.out.println(alternatingSubarray(nums));

    }
}


