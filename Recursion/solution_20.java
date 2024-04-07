import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) { 

        if(digits.isEmpty()){
            return new ArrayList();    // base case i.e if digits is empty return empty list
        }
        
          return helper("",digits);

    }

    public List<String> helper(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';   // getting first digit of our no



        for(int index=(digit-2)*3; index<(digit-1)*3; index++){  
            char ch = (char) ('a'+index);
         list.addAll(helper(p+ch,up.substring(1)));
        }

        return list;
    }
}
