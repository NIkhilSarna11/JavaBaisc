// method overloading : same method but with different parameter 
class ClassOne {

    int a,b,c ; 
    int add(int a, int b){
this.a = a ; 
this.b = b ; 
        return a+b ; 
    }
    int add(int a, int b, int c){
        this.a = a ; 
        this.b = b ;
        this.c = c ; 
        return a+b+c ;  
    }
}
class MethodOverloading {

    public static void main (String args[]){
        ClassOne c1 = new ClassOne() ; 
       
        //c1.add(30,40,50) ; 
        System.out.println( c1.add(10,20) ) ; 
        System.out.println( c1.add(10,20,30) ) ; 

    }
}