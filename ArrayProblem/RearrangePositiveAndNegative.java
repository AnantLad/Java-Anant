import java.util.ArrayList;

public class RearrangePositiveAndNegative {
    static void rearrange_pos_neg(ArrayList<Integer> arr){
        ArrayList<Integer>  pos = new ArrayList<>();
        ArrayList<Integer>  neg = new ArrayList<>();
        int n = arr.size() ;
        for(int i = 0 ; i < n ; i++){
            if(arr.get(i) >= 0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
        }
    if(pos.size() > neg.size()){
        for(int i = 0 ; i < neg.size(); i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
            
        }
    }
    }
}
