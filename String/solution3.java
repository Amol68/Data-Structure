class Solution {
    public int strStr(String haystack, String needle) {

        int hay_length = haystack.length();
        int needle_length = needle.length();

        if(hay_length<needle_length){
            return -1;
        }

        for(int i=0; i<=hay_length-needle_length; i++){

            int j=0;

            while(j<needle_length && haystack.charAt(i+j)==needle.charAt(j))
            j++;

            if(j==needle_length)
            return i;
        }
           return -1;
    }
}

// Time Complexity = big o (m)
