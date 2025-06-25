


public class Car{
    String name;
    int speed;
    Car(String n,int s)
    {
        this.name=n;
        this.speed=s;

    }
    void drive(){
        System.out.println("The "+name+" is driving at "+speed+" km/hr");

    }
public static void main(String[] args) {
   Car ferrari=new Car("Ferrari",220);
    
    ferrari.drive();

    Car Tata = new Car("TATA",70);
 
    Tata.drive();
    
    ev e=new ev ("Tata nexon",90);
    e.drive();
}
}
class ev extends Car{
    ev(String n,int s){
        super(n,s);
    }
}
