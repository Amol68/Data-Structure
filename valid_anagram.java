import java.util.Collections;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n1 = s.length();
        int n2 = t.length();

        if(n1!=n2){
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

       Arrays.sort(s1);
       Arrays.sort(t1);

       for(int i=0; i<s1.length; i++){
           if(s1[i]!=t1[i]){
               return false;
           }
       }
        
        return true;
    }
}
