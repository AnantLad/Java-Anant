import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Twosum {

  public static List<List<Integer>> twoSums(int [] nums , int sum)
  {
    List<List<Integer>> twoSums = new java.util.ArrayList<>();
    for(int i = 0; i<nums.length;i++){
        for(int j = i+1; j<nums.length;j++){
            for(int k = j+1; k<nums.length; k++){
                for(int l = k+1; l < nums.length; l++){
                if(nums[i] + nums[j] + nums[k] + nums[l] == sum){
                    List<Integer> Sumlist = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                    Collections.sort(Sumlist);
                    if(!twoSums.contains(Sumlist)){
                        twoSums.add(Sumlist);
                    }
                }
            }
        }
    }
}
    return twoSums ;
  }
   
      public static void main (String [] args){
        int [] nums = {1,2,3,4,5,6,7,8,9};
        int sum = 13;
        System.out.println(twoSums(nums, sum));
    }
}
