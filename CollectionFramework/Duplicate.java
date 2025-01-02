package CollectionFramework;

import java.util.ArrayList;
import java.util.List;


public class Duplicate {
    public static List<Integer> FindDuplicate (int []number){
        List<Integer> dup = new ArrayList<>();
        for(int i = 0; i < number.length - 1 ; i++ ){
            for(int j = i+1; j < number.length; j++ ){
                if(number[i] == number[j]){

                    if(!dup.contains(number[i])){
                        dup.add(number[i]);
                    }
                    break;
                
                }
            }
        }
        return dup;
    }
    public static void main(String[] args) {
        int[]number = {1,6,7,4,4,7,8,6,2,3,8,9,0};
        List<Integer> duplicates = FindDuplicate(number);
        for(int x : duplicates){
            System.out.print(x + " ");
        }
    }

}
