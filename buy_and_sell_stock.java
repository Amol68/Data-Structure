class Solution {
    public int maxProfit(int[] prices) {

     int max = 0;
     int curr_price = prices[0];   
     int diff;

     for(int i=1; i<prices.length; i++){
 
           
         if(curr_price<prices[i]){

           diff = prices[i]-curr_price;
           max = Math.max(max,diff);
         }
         else{
             curr_price=prices[i];
         }
     }
     return max;
    }
}

// Time complexity: O(n)
// Space complexity: O(1)
