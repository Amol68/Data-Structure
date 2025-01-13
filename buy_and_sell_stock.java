// naive approach (1)

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices==null || prices.length<2) return 0;

        int max_profit = 0;  
        int profit = 0;
        int n = prices.length;

        for(int i=0; i<n-1; i++){
             for(int j=i+1; j<n; j++){

                if(prices[i]<=prices[j]){
                    profit=prices[i]-prices[j];
                    max_profit=Math.max(max_profit,Math.abs(profit));
                }
                profit = 0;
             }
        }

    return max_profit;
    }
}

// Time complexity: O(n^2)
// Space complexity: O(1)

//----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||----------||

// naive approach (1)
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
