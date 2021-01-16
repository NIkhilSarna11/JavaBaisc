import java.util.Scanner ; 

class Methods {

    static void sumOfNumbers(){

        Scanner sc = new Scanner(System.in) ; 
        int numOne, numTwo ; 

        numOne = sc.nextInt() ; 
        numTwo = sc.nextInt() ; 
        int SumOfTwo = numOne + numTwo ; 
        System.out.println ("Sum of two numbers are " + SumOfTwo) ; 

    }
public static void main (String[] args){

    Methods mRef = new Methods() ; 
    Methods.sumOfNumbers() ; 
    //mRef.sumOfNumbers() ; 

}
    
}
