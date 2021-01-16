class CheckingVotes {

    public static void main(String args[]) 
    {
     
     int[] repbVotes = {1000, 1002, 1003, 10, 1020, 123, 1201} ;
     int[]  demoVotes = {213,532,123,75999,23499,8865, 12355} ; 
      
     int totalrepbCount = 0 ; 
     int totaldemoCount = 0 ; 

     for (int i = 0 ; i < repbVotes.length ; i++ ){

     totalrepbCount = totalrepbCount + repbVotes[i] ; 
     totaldemoCount = totaldemoCount + demoVotes[i] ; 
     }
    
if( totaldemoCount > totalrepbCount){
    System.out.println( "Democratics won the election !!") ; 
}
else {
    System.out.println( "Republic won the election !!") ; 
}
    }
}