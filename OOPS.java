class Restaurent{
   
     String name ; 
     String phone ; 
     double rating ; 

     Restaurent(){ // contructor
         name = "NA" ; 
         phone = "NA" ;
         rating = 5.0 ;  

     }

     void writeRestaurent(String name, String phone, double rating) {

        this.name = name ; 
        this.phone = phone ; 
        this.rating = rating ;
     }

     void readRestaurent (){

        System.out.println("Name of the person is " + name ) ; 
        System.out.println("Phone number is " + phone) ; 
        System.out.println("Rating given is " + rating) ; 
     }
} 

public class OOPS {
public static void main (String[] args) { 

    Restaurent r1 = new Restaurent() ; 
    r1.writeRestaurent("Nikhil", "8146027009", 4.0) ; 
    r1.readRestaurent() ; 
}
    
}