/*StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an
immutable sequence of characters, the StringBuilder class provides an alternative to String Class, as it creates  
a mutable sequence of characters. The function of StringBuilder is very much similar to the StringBuffer class,
as both of them provide an alternative to String Class by making a mutable sequence of characters. However, the 
StringBuilder class differs from the StringBuffer class on the basis of synchronization. The StringBuilder class 
provides no guarantee of synchronization whereas the StringBuffer class does. */

class solution1 {
    public static void main(String[] args) {
       
       StringBuilder str = new StringBuilder("Amol");
       System.out.println(str);
       System.out.println(str.charAt(2));
       
       str.setCharAt(1,'M');
       System.out.println(str);
       
         str.insert(1,'N');
        System.out.println(str);
        
        str.delete(1,2); //second parameter i.e 2 is non inclusive
        System.out.println(str);
        
        str.append('K');
        System.out.println(str);
        
         System.out.println(str.length());
    }
}
