
//encapsulation//
public class User{
    private String ac_name;
    private int balance;

    User(String n, int b){
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
        User u=new User("Dinesh",1000);
       

         u.disp();
        
    }
}