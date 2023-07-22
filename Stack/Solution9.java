// Naive Approach
class Solution9{
    
    public static int find_largest_area(int[] arr , int n){
        
        int res = 0;
        
        for(int i=0; i<n; i++){
            int curr = arr[i];
            
            for(int j=i-1; j>=0; j--){
                if(arr[j]>=arr[i]){
                    curr += arr[i];
                    else
                    break;
                }
            }
            
              for(int j=i+1; j<n; j++){
                if(arr[j]>=arr[i]){
                    curr += arr[i];
                    else
                    break;
                }
            }
            
          res = max(current , res);
            
        }
        return res;
    }

}

// Time Complexity = O(n2)  &&  Space Complexity = O(n)


//--------->>--------->>--------->>--------->>--------->>--------->>--------->>--------->>--------->>--------->>--------->>

class Solution {

  public int[] next_smaller_element(int[] arr , int n){

    int[] ans = new int[n];
    Stack<Integer> st = new Stack<>();

    for(int i=n-1; i>=0; i--){

      while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
          st.pop();
      }

       if(st.isEmpty()){
           ans[i]=n;
       }
       else{
           ans[i]=st.peek();
       }
       st.push(i);
    }
     return ans;
  }


  public int[] prev_smaller_element(int[] arr , int n){

    int ans[] = new int[n];
    Stack<Integer> st = new Stack<>();

    for(int i=0; i<n; i++){

      while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
          st.pop();
      }

       if(st.isEmpty()){
           ans[i]=-1;
       }
       else{
           ans[i]=st.peek();
       }
       st.push(i);
    }
     return ans;
  }

    public int largestRectangleArea(int[] arr) {

        int n = arr.length;

        int[] prev = new int[n];
        int[] next = new int[n];

        prev = prev_smaller_element(arr , n);
        next = next_smaller_element(arr , n);

        int max_area = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            int width = next[i]-prev[i]-1;
            int area = width * arr[i];

            if(area>max_area){
                max_area = area;
            }
        }
        return max_area;
    }
}

// Time Complexity = O(n)  &&  Space Complexity = O(n)
