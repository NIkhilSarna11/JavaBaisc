class BubbleSort {

    public static void main (String args[]){

        int[] arr1 = {5,2,3,1,9} ; 
        //asc order.....
        //7,3 

        int swap  ; 
    


       for (int i = 0 ; i < 5 ; i++){
           for (int j = i+1 ; j < 5 ; j++) {
            if (arr1[i] > arr1[j]){
                swap = arr1[j] ; 
                arr1[j] = arr1[i] ; 
                arr1[i] = swap ; 
                }
            }
        }
// {5,2,3,1,9}


}
for (int j = 0 ; j < 5 ; j++){
            System.out.print(arr1[j]) ; 
        }
    }
}