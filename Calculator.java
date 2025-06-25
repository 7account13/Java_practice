public class Calculator{
    int a;
    int b;
    
    void add(){
        System.out.println(a+b);
        }
    void sub(){
        System.out.println(a-b);
        }
    void mul(){
        System.out.println(a*b);
        }
    void div(){
        System.out.println(a/b);
        
    }
    

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.a=10;
        c.b=20;

        c.add();
        c.sub();
        c.mul();
        c.div();
        
    }
}