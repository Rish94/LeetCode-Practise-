class Solution {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int rem;
        int temp = x;
        while(x>0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if(temp == rev){
            return true;
        }
        else{
             return false;
        }
       
        
    }

    public static void main(String[] args) {
        int a = 121;
        System.out.println(isPalindrome(a));
    }
}