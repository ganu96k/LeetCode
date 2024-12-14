import java.util.*;
public class IsPalindromeNumber {

      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));


    }

    // main logic leetcode prome 
        public static boolean isPalindrome(int x) {
            if(x < 0 ){
                return false ;
            }
    
            int original = x ;
            int reverse = 0 ;
    
            while(x > 0){
                 int digit = x % 10 ;
                 reverse = reverse * 10 + digit ;
                  x = x / 10 ; 
            }
            if(original != reverse){
                return false ;
            }
            return true ;

        }
    }

