class Animal {
    void eat (){
        System.out.println("Animal will eat everything..") ; 
    }
}

class Dog extends Animal{
    void eat2 (){
        System.out.println("dog is the child of Animal class..") ; 
    }

}

class SingleInheritance {

    public static void main (String args[]) { 

        Dog d1 = new Dog() ; 
        d1.eat() ; 


    }
}