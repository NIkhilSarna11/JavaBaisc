class arrayIndex {
    public static void main (String args[]) {

        int[] products = {100,101, 102, 103, 104, 105} ; 
        int findProductIndex = 105 ; 
          for (int i= 0; i < products.length ;i++){
              if(products[i] == findProductIndex ){
                  System.out.println ("Your product is at "+ i + " level") ; 
              }

          }



    }
}