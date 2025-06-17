
public class RemoveDuplicate {
    static int remove_dup(int [] arr){
        
        
        int i = 1 ;
        for (int j = 1; j < arr.length; j++){
            if(arr[j] != arr[j-1]){
                arr[i++] = arr[j];
                
            }
        } 
        return i;
        }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,5,6,6,7,7,9};
        int result = remove_dup(arr);
        for(int i = 0 ; i < result ; i++){
        System.out.print(arr[i] + " ");
    }
}
}
