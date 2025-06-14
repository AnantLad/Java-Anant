import java.util.ArrayList;
// import java.util.Collections;


public class Leader {
    static ArrayList<Integer> leader_element(int [] arr){
        ArrayList<Integer> Ans = new ArrayList<>();
        int n = arr.length ;
        int maxi = Integer.MIN_VALUE ;
        for(int i = n-1 ; i >= 0 ; i--){
            if (arr[i] > maxi) {
                Ans.add(arr[i]);
                maxi = arr[i];
            }
        }
    //   Collections.reverse(Ans); 
      return Ans ; 
    }
    public static void main(String[] args) {
        int [] arr = {10,23,14,6,0,5,};
        ArrayList<Integer> Leader = leader_element(arr);
        System.out.println(Leader);
    }
}
