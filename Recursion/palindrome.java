package Recursion ;

public class palindrome {
    static boolean str(int i,String s ){
        if(i >= s.length()/2){
            return true ; 
        }
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            {
                return false ;
            } 
                return str(i+1, s);
            }
        
    
    public static void main(String[] args) {
            String s = "msdam";
            if(str(0,s)){
                System.out.println("It is palindrome");
            }
            else{
                System.out.println("It is not palindrome ");
            }
    }
    
}