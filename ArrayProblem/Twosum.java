
import java.util.HashMap;

public class Twosum {

  public static int [] twoSums(int [] nums , int target)
  {
    HashMap<Integer,Integer> map= new HashMap<>();

    for(int i = 0; i<nums.length;i++){
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] {map.get(complement),i};
        }
        map.put(nums[i],i);
}
    return new int [] {} ;
  }
   
      public static void main (String [] args){
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int target = 13;
        int result [] = twoSums(nums, target);
        for(int val : result ){
        System.out.print(val +" ");
    }
}
}