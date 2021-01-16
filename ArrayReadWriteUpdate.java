public class ArrayReadWriteUpdate {

public static void main (String args[]){

    int[] employeeSalaries = {1000, 10009, 1002, 1003} ;  
    // System.out.println (employeeSalaries[3]) ;
 
    int max = employeeSalaries[0] ; 
     for(int i = 0 ; i< employeeSalaries.length ; i++)
     {
         if(employeeSalaries[i]>max){
             max = employeeSalaries[i] ; 

         }
       
        
    }

    System.out.println("Maximum number is  = " + max) ; 
}

}