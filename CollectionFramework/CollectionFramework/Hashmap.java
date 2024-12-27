package CollectionFramework;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Hashmap {
    
        public List<List<Integer>>threesum(int[]num){
             Map<Integer,Set<List<Integer>>> twoSumsMap = new java.util.HashMap <>();
            for(int i = 0; i<num.length; i++){
                for(int j = i+1;j<num.length;j++){
                    int twoSum = num[i] + num[j];
                    if(!twoSumsMap.containsKey(twoSum)){
                        twoSumsMap.put(twoSum, new HashSet<>());
                    }
                    List<Integer> sortedTuple = Arrays.asList(num[i],num[j]);
                    Collections.sort(sortedTuple);
                    twoSumsMap.get(twoSum).add(sortedTuple);
                }
            }
            Map<Integer,Integer> counterForNum = new HashMap<>();
            for(int numb :num ){
                counterForNum.put(numb, counterForNum.getOrDefault(numb,0) + 1);
    
            }
             
            Map<List<Integer>,List<Integer>> threeSumsMap = new java.util.HashMap<>();
            for(int i = 0; i<num.length;i++){
                Set<List<Integer>> twoSumTupleForValue = twoSumsMap.getOrDefault(-num[i], new HashSet<>());
                for(List<Integer> tuple : twoSumTupleForValue){
                    int numOne = tuple.get(0), numTwo = tuple.get(1);
                    if((num[i] != numOne && num[i] != numTwo) || counterForNum.get(num[i]) >=3){
                        List<Integer> sortedNum = Arrays.asList(num[i], numOne,numTwo);
                        threeSumsMap.put(sortedNum, sortedNum);
                    }
                }
            }
            return new ArrayList<>(threeSumsMap.values());
        }
        public static void main(String[] args) {
           
        
        int[] num= { 1,0,3,5,4,2,6,7,};
         int target = 8;
         threeSumsMap.values(num, target);
                System.out.println(threeSumsMap(num,target));
            }
                
   
}
