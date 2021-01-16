import java.util.Scanner ; 

class SwitchTest { 
     
    public static void main (String args[]){

        int a ;
        Scanner sc = new Scanner(System.in) ; 
        a = sc.nextInt() ; 

        switch(a){
            case 10: 
            System.out.println("Number is 10") ; 
            break ; 
            case 20: 
            System.out.println("Number is 20") ; 
            break ; 
            case 30: 
            System.out.println("Number is 30") ; 
            break ; 
            case 40: 
            System.out.println("Number is 40") ; 
            break ; 
            
        }
    }


}