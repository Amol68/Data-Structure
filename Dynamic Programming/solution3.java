// Brute Force Approach
class Solution {
    public int maxProduct(int[] nums) {

      int n = nums.length;

      if(nums==null) return 0;
      if(n==1) return nums[0]; 
      int max_product = Integer.MIN_VALUE;
      int product=1;

      for(int i=0; i<n; i++){ 

         for(int j=i; j<n; j++){

          
             if(i==j){
                product = nums[i];
                 max_product = Math.max(product,max_product);
             }
             
              else{
                    product = product*nums[j];
                    max_product = Math.max(product,max_product);
                 }

               }
        
       }
            return max_product ;
       }
      }
       
// Time Complexity: O(n^2);
// Space Complexity: O(1);
---------------->>---------------->>---------------->>---------------->>---------------->>---------------->>---------------->>


class Solution {
    public int maxProduct(int[] nums) {

      int n = nums.length;
      int left_product=1;
      int right_product=1;
      int ans = Integer.MIN_VALUE;

      for(int i=0; i<n; i++){ 

        left_product=left_product==0 ? 1 : left_product;
        right_product =right_product==0 ? 1 : right_product;

       left_product*=nums[i];
       right_product*=nums[n-1-i];

       ans = Math.max(ans,Math.max(left_product,right_product));
       }
        return ans;
       }
        }

// Time Complexity: O(n);
// Space Complexity: O(1);
