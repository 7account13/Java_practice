
//encapsulation//
//inheritance//
 class User1{
    private String ac_name;
    private int balance;

    User1(String n, int b){
        this.ac_name=n;
        this.balance=b;

    }
    public void setName(String name){
        this.ac_name=name;
    }
    public String getName(){
    return ac_name;
    }
    
    public void setBalance(int balan){
    this.balance=balan;
    }
    public int getBalance(){
        return balance;
    }

    void disp(){
        System.out.println("Account Holder : "+ac_name);
        System.out.println("Balance : "+balance);
    }

     public static void main(String[] args) {
     PrimeUser p= new PrimeUser("Dinesh",1000,34);
     p.disp();
     p.showPrime();
  }  
}

 class PrimeUser extends User1{
    int cashbackpercent;

    PrimeUser(String ac_name,int balance,int cashbackpercent){
        super(ac_name,balance);
        this.cashbackpercent=cashbackpercent;
    }

    void showPrime(){
        System.out.println("Cashback percent: "+cashbackpercent+"%");
    }
    

       
   
}