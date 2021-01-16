class Account{

    String ownerName ; 
    float amount ; 
    int accountNumber ; 

    void insert(String name, float amount, int accountNumber ) {
        ownerName = name ; 
        this.amount = amount ; 
        this.accountNumber = accountNumber ; 
    }

    void accountInformation () { 
        System.out.println("name of the owner is " + ownerName) ; 
        System.out.println("Amount available is " + amount) ; 
        System.out.println("account number is " + accountNumber) ; 
    }

    void deposite(int amt){
        amount = amount + amt ; 
        System.out.println("Amount entered is " + amt) ;
        System.out.println("Total available amount is " + amount) ; 
    }
    void withdraw(int amt){
        amount = amount - amt ; 
        System.out.println("Amount withdrawed is " + amt) ;
        System.out.println("Total available amount is " + amount) ; 
}

void changeAccountDetails (String name) {
           System.out.println("New name will be " + name) ; 
           ownerName = name ; 

}
}

class BankAccount{

    public static void main (String args[]){
        Account a1 = new Account() ; 
        a1.insert("Nikhil Sarna", 1000, 123456) ; 
        a1.accountInformation();
    a1.deposite(400);
    a1.accountInformation();
    a1.withdraw(300) ; 
    a1.changeAccountDetails("nikhil sarna 1");
System.out.println("--------------------") ; 

a1.accountInformation();
    }

    
}