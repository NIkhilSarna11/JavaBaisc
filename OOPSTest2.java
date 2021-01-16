class Student{
    int rollNumber ; 
    String name ; 

    void insertRecord (int r , String n) {
        rollNumber = r ; 
        name = n ; 
        
    }

    void displayRecord(){
        System.out.println("Name is " + name + " Roll number is " + rollNumber) ; 
    }
}

class OOPSTest2 {
 
    public static void main (String args[]) {
        Student s1 = new Student() ; 
        //s1.rollNumber = 1411291 ; 
        //s1.name = "Nikhil Sarna" ; 
        s1.insertRecord(1411290 , "Nikhil Sarna") ; 
        s1.displayRecord() ; 
    }
}