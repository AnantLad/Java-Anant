

import java.util.ArrayList;
import java.util.List;


public class Duplicate {
  static List<Integer> FindDuplicate(int [] number){
    List<Integer> dup = new ArrayList<>();
    for(int i = 0; i < number.length; i++){
        for(int j = i+1; j < number.length; j++){
            if(number[i] == number[j]){
                if(!dup.contains(number[i])){
                    dup.add(number[i]);
                }
            }
        }
    }
    return dup;
  }
    public static void main(String[] args) {
        int[]number = {1,1,1,2,3,5,8,8};
        List<Integer> duplicates = FindDuplicate(number);
        for(int x : duplicates){
            System.out.print(x + " ");
        }
    }

}

