
public class Array {
    static int largest_num(int [] arr){
        int large = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large ; 
    }
    public static void main(String[] args) {
        int [] arr = {3,5,2,4,8};
        int result = largest_num(arr);
        System.out.println("The largest number is " + result);
    }
}
 class second_largest{
    static int sec_largest(int [] arr){
        int largest = arr[0];
        int secondlargest = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                secondlargest = largest ; 
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int [] arr = {3,5,7,6,9,8,2,1};
        int result = sec_largest(arr);
        System.out.println("The second largest number is " + result);
    }
 }
