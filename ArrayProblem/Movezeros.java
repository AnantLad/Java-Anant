import java.util.Arrays;

public class Movezeros {
   static int [] move_zeros_to_end(int [] arr){
    int j = -1;
    for(int i = 0; i < arr.length ; i++){
        if (arr[i] == 0){
            i = j ;
            break ; 
        }
    }
    if( j == -1) return arr ; 
    for(int i = 0; i < arr.length ; i++){
        if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
        }
    } 
    return arr ;
       
    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,5,6,0,7,0,8,0,0};
        int result []= move_zeros_to_end(arr);
        System.out.println(Arrays.toString(result));
    }
}
