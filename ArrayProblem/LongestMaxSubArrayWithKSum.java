public class LongestMaxSubArrayWithKSum{
    
    static int MaxSubArrayWithKSum(int [] arr , int k){
        int right = 0 , left = 0;
        int sum = arr[0];
        int n = arr.length ; 
        int maxlen = 0;

        while(right < n){
            while(left < right && sum > k){
                sum -= arr[left];
                left ++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right -left +1);
            }
            right ++;
            if(right < n) sum += arr[right];
        }
        return maxlen ;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,1,1,1,3,3};
        int k = 6 ;
        System.out.println(MaxSubArrayWithKSum(arr, k));
    }
}

