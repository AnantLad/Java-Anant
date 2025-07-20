package Recursion;

import java.util.Arrays;

public class Example {
   static void reverse_array(int [] arr){
    reverse(arr,0,arr.length-1);
   }
   static void reverse(int [] arr , int i , int j){
   if(i<j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    reverse(arr , ++i,--j);
   }
   }
    public static void main (String [] args){
        int [] arr = {1,2,3,4,5,6,7,8};
        reverse_array(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}




    

