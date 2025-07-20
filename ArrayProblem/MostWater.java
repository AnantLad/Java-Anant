

public class MostWater {

    static int maxWater(int [] arr){
        int left = 0, right = arr.length - 1;
        int res = 0;
        while(left<right){

            int water = Math.min(arr[left] , arr[right])*(right - left);

            res = Math.max(res, water);

            if( arr[left] < arr[right])
            left += 1;

           else
            right -= 1; 
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = { 2,1,3,6,8,5,4,8};
        System.out.println(maxWater(arr));
    }
}