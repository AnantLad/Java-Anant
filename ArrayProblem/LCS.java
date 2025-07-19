import java.util.HashSet;
import java.util.Set;

public class LCS {
    static int longest_consecutive (int [] arr){
        Set<Integer> set = new HashSet<>();
        int len = 0 ;

        for(int val : arr){
            set.add(val);
        }
        for(int val : arr){
            if(set.contains(val) && !set.contains(val - 1)){
                int cur = val , cnt = 0 ;
                while(set.contains(cur)){
                set.remove(cur);
                cur ++ ;
                cnt ++ ;
            }
        len = Math.max(len, cnt);
        }
        }
        return len ; 
    }
    public static void main(String[] args) {
        int [] arr = {1,3,90,4,5,91,2,93,7,6,94,92};
        System.out.println(longest_consecutive(arr));
    }
}
