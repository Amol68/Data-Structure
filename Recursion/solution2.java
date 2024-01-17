

class Nto1 {
    
     static void print(int num){
         if(num>0){
         System.out.print(" "+num);
         num--;
         print(num);
         }
     }
    public static void main(String[] args) {
        int n = 6;
        print(n);
    }
}


//----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->---->------>------>------>------>

// another way to print 7,6,5....1

class Nto1 {
    
    static void print(int num){
        if(num==0){
            return;
        }
        System.out.print(" "+num);
        print(num-1);
        
    }
    public static void main(String[] args) {
    
        int num = 7;
        print(7);
    }
}


//----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->---->------>------>------>------>


// focus more:

class Nto1 {
    
    static void print(int num){
        if(num==0){
            return;
        }
        
        System.out.print(" "+num);
         print(num-1);
         System.out.print(" "+num);
       
    }
    public static void main(String[] args) {
    
        int num = 7;
        print(7);
    }
}

