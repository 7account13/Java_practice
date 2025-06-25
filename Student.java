//Class-student       Checkpass,disp-method      Tina-object
public class Student{
    public String name;
    public int mark;
    public String Status;
    void Checkpass(){
        if(mark>=40){
            Status= "Passed";
        }
        else{
            Status="failed";
        
        }
    }
    void Disp(){
       System.err.println("Name: "+name+" - "+Status);

    }
    

public static void main(String[] args) {
    Student Raghul = new Student();
    Raghul.name="Raghul";
    Raghul.mark=70;
    Raghul.Checkpass();
    Raghul.Disp();

    Student Tina=new Student();
    Tina.name="Tina";
    Tina.mark=60;
    Tina.Checkpass();
    Tina.Disp();
}
}