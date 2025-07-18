public class SecondLargest {
    public static int second_largest(int [] nums){
        if(nums.length < 2){
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num:nums) {
            
            if(num > first){
                second = first ;
                first = num ; 
            }else if( num > second  && second != first ){
                second = num ;
            }
        }
        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element (array may contain all identical elements)");
        }       -return second ;
    }
    public static void main(String[] args) {
          int[] nums = {12, 35, 1, 10, 34, 1};
        int secondLargest = second_largest(nums);
        System.out.println("Second largest number is: " + secondLargest);
    }
}
