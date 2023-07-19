import java.util.Stack;
class Solution4 {
    
    public static void stock_span(int[] stock , int[] span){
        
        Stack<Integer> s1 = new Stack<>(); 
        span[0]=1;
        s1.push(0);
        
        for(int i=1; i<stock.length; i++){
            int curr_price = stock[i];
            
            while(!s1.isEmpty() && curr_price>stock[s1.peek()]){
                s1.pop();
            }
            
            if(s1.isEmpty()){
                span[i]=1+1;
            }
            
            else{
                
                int prev_high = s1.peek();
                span[i]=i-prev_high;
            }
            
            s1.push(i);
        }
        
    }
    
    
    public static void main(String[] args) 
    {
        int[] stock ={100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
         stock_span(stock , span);
         
         for(int i=0; i<span.length; i++){
             System.out.println(span[i]);
         }
    }
}
