

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Dinesh");
        System.out.println("Name is: " + p.getName());
    }
}
class Person {
    private String name;  // private = hidden from outside

    // Setter method
    public void setName(String newName) {
        name = newName;
    }

    // Getter method
    public String getName() {
        return name;
    }
}