public class Car{
    String name;
    int speed;
    void drive(){
        System.out.println("The "+name+" is driving at "+speed+" km/hr");

    }
public static void main(String[] args) {
    Car ferrari=new Car();
    ferrari.name="ferrari";
    ferrari.speed=220;
    ferrari.drive();

    Car Tata = new Car();
    Tata.name="tata nano";
    Tata.speed=45;
    Tata.drive();
}
}
