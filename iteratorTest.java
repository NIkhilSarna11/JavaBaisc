import java.util.Scanner ; 

class iteratorTest {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in) ; 
     
        int floor = 1 ;
        byte myFloor ; 

        System.out.println("Please press floor here !!");
         myFloor = sc.nextByte() ; 

        for(floor  = 1 ; floor <=10; floor = floor + 1 ){
        System.out.println("u are on floor test " + floor + " arrived") ;
        
             if( floor == myFloor){
            System.out.println("u are on floor " + floor + " arrived") ;
            break ;  
             }
        
    }
    
    }
    
}