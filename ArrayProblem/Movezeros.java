import java.util.Arrays;

public class Movezeros {
   static int [] move_zeros_to_end(int [] arr){
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            if (i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
    }
    return arr;
       
    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,5,6,0,7,0,8,0,0};
        int result []= move_zeros_to_end(arr);
        System.out.println(Arrays.toString(result));
    }
}
