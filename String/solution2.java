

class solution2 {
    public static void main(String[] args) {
       
       StringBuilder s = new StringBuilder("Hello");
       
       for(int i=0; i<s.length()/2; i++){      // we traverse only till element before mid element
           
           int front = i;
           int back = s.length()-1-i;
           
           char front_char = s.charAt(front);
           char back_char = s.charAt(back);
           
           s.setCharAt(front , back_char);
           s.setCharAt(back , front_char);
       }
       System.out.println(s);
    }
}
