class Solution {
    public boolean validPalindrome(String s) {
        
         int left = 0;
         int right = s.length()-1;

         while(left<right){

             if(s.charAt(left)==s.charAt(right)){
                 left++;
                 right--;
             }
             else{
                 return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1); // skipping either of two unequal characters
             }
         }
         return true;

    }

    public boolean isPalindrome(String s,int l, int r){

        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else return false;
        }

        return true;
    }
}
