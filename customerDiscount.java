class customerDiscount {

public static void main(String args[]) {
    double[] customerPurchase = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000} ; 
    double specialDiscount = 0 ; 
    for (int i = 1 ; i < customerPurchase.length ; i++){
        if(i%3 == 0) {

            specialDiscount =  ( double )( 0.3 ) * (customerPurchase[i]) ; 
             customerPurchase[i] =  customerPurchase[i] - specialDiscount ; 
            System.out.println ("30 percent discount is here !! You only have to pay " + customerPurchase[i]); 
        }
        else if (i%5 == 0 ) {
            specialDiscount =  ( double )(0.5) * (customerPurchase[i])  ; 
            customerPurchase[i] =  customerPurchase[i] - specialDiscount ; 
            System.out.println ("50 percent discount is here !! You only have to pay " + customerPurchase[i]);

        }
        else { 
            System.out.println ("You have to pay " + customerPurchase[i]) ; 
        }
    }
    
}

}