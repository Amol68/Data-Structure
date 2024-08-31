// naive approach

class Solution {
    public int maxProfit(int[] prices) {

     int min = Integer.MAX_VALUE;
     int min_index=-1;  // index of mininum element
     int max_profit = 0;
     int curr_profit;

     for(int i=0; i<prices.length; i++){

          if(prices[i]<min){
             min=prices[i];
             min_index=i;
          } 
 
     }   // for loop to find min element and its index;

 
    if(min_index==prices.length-1) return 0;

      for(int i=min_index; i<prices.length; i++){

            if(prices[i]>min){

                curr_profit=prices[i]-min;
                 if(curr_profit>max_profit){
                    max_profit=curr_profit;
                 }
            } 
            
      }
       return max_profit;  
    }
}




//----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||

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
