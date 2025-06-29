public class MaxSumOfGivenSubArray {
    static int max_sum_of_subarrary(int [] arr){
        int maximumSum = Integer.MIN_VALUE ;
        int sum = 0 ;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];

            if(sum > maximumSum){
                maximumSum = sum ;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maximumSum ;
    }
    public static void main(String[] args) {
        int [] arr = {1,-2,-1,1,4,-1,-2,6,-2,3};
        int result = max_sum_of_subarrary(arr);
        System.out.println(result); 
    }
}
