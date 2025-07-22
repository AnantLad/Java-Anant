public class MajorityElement {
     public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
           if (num == candidate) {
             count += 1;
            } else {
                count -= 1;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,2,1,1,1,1,3,1};
        System.out.println(majorityElement(nums));
     }
}

