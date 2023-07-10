class Solution8 {
   String removeDuplicates(String str) {

     Stack<Character> stack = new Stack<>();
       StringBuilder b = new StringBuilder();

       for(int i=0; i<str.length(); i++){

           if(!stack.isEmpty() && stack.peek()==str.charAt(i)){
               stack.pop();
           }else{
               stack.push(str.charAt(i));
           }
       }

       while(!stack.isEmpty()){
           b.append(stack.pop());
       }

       return b.reverse().toString();

         }
};
