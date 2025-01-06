package CollectionFramework;

public class MaxProductOfSubarray {
    static long maxProduct(int [] arr){
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;

        int leftToright = 1;

        int rightToLeft = 1;

        for(int i = 0; i < n; i++){
            if(leftToright == 0)
            leftToright = 1;
            if(rightToLeft == 0)
            rightToLeft = 1;

            leftToright *= arr[i];

            int j = n - i -1;
            rightToLeft *= arr[j];
            maxProd = Math.max(leftToright,Math.max(rightToLeft,maxProd));

        }
        return maxProd;
    }

    public static void main(String[] args) {
        int [] arr = {6,-3,-10,0,2};
        System.out.println(maxProduct(arr));
    }
}
