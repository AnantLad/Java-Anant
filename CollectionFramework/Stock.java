
public class Stock {
    


    static int maxProfitUtil(int i, int k, int buy,int[] prices){

        if (k <= 0 || i >= prices.length)
            return 0;

        int result = 0, profit = 0;

        
        if (buy == 1){
          
           
            profit = maxProfitUtil(i + 1, k, 0,
                           prices) - prices[i];
            result = Math.max(result, profit);
        } else{
          
          
            profit = prices[i] + 
              maxProfitUtil(i + 1,k - 1,1,prices);
            result = Math.max(result, profit);
        }

        
        profit = maxProfitUtil(i + 1, k, buy,prices);
        return Math.max(result, profit);
    }

    
    static int maxProfit(int k, int[] prices){
      
       
        return maxProfitUtil(0, k, 1, prices);
    }

    public static void main(String[] args){
        int k = 2;
        int[] prices = {10, 22, 5, 75, 65, 80};

        System.out.println(maxProfit(k, prices));
    }
}

