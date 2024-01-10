class Solution {
    public String reverseWords(String s) {

      String[] words = s.split(" +");   // splitting the string using sapce " " as a regex ('+' means there could me single or multiple spaces)
      StringBuilder sb = new StringBuilder();  // immutable strings
        
      for(int i=words.length-1; i>=0; i--){
          sb.append(words[i]);
          sb.append(" ");  
      }

      return sb.toString().trim(); // converting stringbuilder to string and cutting white spaces using trim function
     

    }
}
