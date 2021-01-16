class MatrixAddition {
    public static void main (String args[]){

        int [][] matrix1 = {{1,3,4},{2,4,3},{3,4,5}};
        int [][] matrix2 = {{1,3,4},{2,4,3},{1,2,4}};  
        int [][] addMatrix = new int[3][3] ; 

        for (int i = 0 ; i < 3 ;  i++) { 
            for (int j = 0 ; j < 3; j++){
                addMatrix[i][j] = matrix1[i][j] + matrix2[i][j] ;
                System.out.print(addMatrix[i][j]) ;  
            }
            System.out.println( " " ) ; 
        }

    }
}