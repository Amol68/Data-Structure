class HelloWorld {

 
    public static void main(String[] args) {
         
         StringBuilder sb = new StringBuilder();
         String str ="baccad";
         char[] arr = str.toCharArray();
         
         for(int i=0; i<arr.length; i++){
             if(arr[i]!='a'){
                 sb.append(arr[i]);
             }
         }
         
          System.out.println(sb);
         
    }
}


//-------->-------->-------->-------->-------->USING RECURSION-------->-------->-------->-------->-------->-------->-------->


import java.util.*;

class HelloWorld {
 
    public static void main(String[] args) {
         
        String str = "baccdh";
        remove("",str);
    }
    
    private static void remove(String p,String up){
        
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        if(ch=='a'){
            remove(p,up.substring(1));
        }
        else{
            remove(p+ch,up.substring(1));
        }
    }
}



//-------->-------->-------->-------->-------->USING RECURSION Another approach-------->-------->-------->-------->-------->-------->-------->


class HelloWorld {

  public static void main(String[] args) {

    String str = "baccdh";
    String result = remove(str);
    System.out.println(result);
  }

  private static String remove(String up) {

    if (up.isEmpty()) {
      return "";
    }

    char ch = up.charAt(0);

    if (ch == 'a') {
      return remove(up.substring(1));
    } else {
      return remove(ch + up.substring(1));
    }

  }
}


//-------->-------->-------->-------->-------->Skip a string-------->-------->-------->-------->-------->-------->-------->


class HelloWorld {
    
    private static String skip(String up){
        
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith("apple")){
           return skip(up.substring(5));
        }
        else{
            return up.charAt(0)+ skip(up.substring(1));
        }
    }
    
    public static void main(String[] args) {
    
    
    System.out.println(skip("uvwapplexyz"));
    
    
    }
}
