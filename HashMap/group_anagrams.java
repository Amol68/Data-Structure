
  // Easier Approach

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String , List<String>> mp = new HashMap<>();


        // Steps
      // -> Loop through the given string array
      // -> sort the strings
      // -> insert sorted string in hmap as key along with corresponding string as values
      // -> Iterate through hmap
        
              for(String s : strs){
                  char[] arr = s.toCharArray();
                  Arrays.sort(arr);
                  String sorted_string = new String(arr);

                   if(!mp.containsKey(sorted_string)){
                       mp.put(sorted_string,new ArrayList<>());
                   }

                     mp.get(sorted_string).add(s);
              }

              return new ArrayList<>(mp.values());
    
        }
        
    }



---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->---------->

  


import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      HashMap<String,List<String>> map = new HashMap<>();
      List<List<String>> final_list = new ArrayList<>();

      for(String str : strs){
          char[] temp_array = str.toCharArray();
          Arrays.sort(temp_array);
          String sorted_string = new String(temp_array);

          if(map.containsKey(sorted_string)){
              map.get(sorted_string).add(str);
          }
          else{
              List<String> list = new ArrayList<>();
              list.add(str);
              map.put(sorted_string,list);
          }
      }

      for(Map.Entry<String,List<String>> ent : map.entrySet()){
          final_list.add(ent.getValue());
      }
        return final_list;
        }
        
    }

