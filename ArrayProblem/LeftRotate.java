import java.util.Arrays;

public class LeftRotate {
    static int[] left_rotated(int [] arr){
        int temp = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            arr[i-1] = arr[i];  
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int result []= left_rotated(arr);
        System.out.println(Arrays.toString(result));
    }
}
class LeftRotate_By_D_place{
    static void rotateBy_D_place(int [] arr , int d){
        int n = arr.length;
        d %= n ;
        
        reverse(arr , 0 , d-1);

        reverse(arr , d , n-1);

        reverse(arr , 0 , n-1);

    }
    static void reverse( int [] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int d = 5 ; 
        rotateBy_D_place(arr, d);

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}