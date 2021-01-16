class Student {

   /* Student(){
        System.out.println("this is from constructor") ; 
    }*/
String name ; 
    Student(String name) {
        this.name = name ; 
        System.out.println(name) ; 
    }
}

class Constructors{
    public static void main(String args[]){
  Student s1 = new Student("Nikhil") ; 
  s1.name = "Nikita" ; 
  System.out.println(s1.name) ; 

    }

}
