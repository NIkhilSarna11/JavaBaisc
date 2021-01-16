class Counter { 

    static int count = 0 ;
    
    Counter(){
        count++ ; 
        System.out.println(count) ; 
    }
}

class StaticTest{

    public static void main (String args[]){
Counter c1 = new Counter() ;
c1.count= 4; 
System.out.println(c1.count) ; 
System.out.println(c1.count) ; 
Counter c2 = new Counter() ;
Counter c3 = new Counter() ; 
    }
    
}