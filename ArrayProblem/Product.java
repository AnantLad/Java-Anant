

import java.util.Arrays;

public class Product {
    static int[] productExceptSelf(int[] nu,int n){
        int c = 0;
        int prod = 1;
        int[] res = new int[n]; 
        Arrays.fill(res,0);
        for( int num : nu){
            if (num == 0) 
                 c++;
            else
                prod *= num;  
        }
        for(int i = 0; i < n; i++){
            if(c>1)
            res[i] = 0;
            else if(c == 1){
                if (nu[i]==0) 
                res[i] = prod;
                else
                res[i] = 0;   
            }
            else{
                res[i] = prod/nu[i];
            }
        }
        return res;
    } 

    public static void main(String[] args) {
        int [] nu = {2,5,3,4,1};
        int [] result = productExceptSelf(nu,nu.length);
    
        for(int val : result){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
  