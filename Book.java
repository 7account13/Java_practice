public class Book{
    int price;
    String name;
    String author;
    void disp(){
        System.out.println("Book name: "+name+"Book Price: "+price+"Author"+author);
    }
    public static void main(String[] args) {
        Book a=new Book();
        a.name="Twisted love";
        a.author="Ana Huang";
        a.price=300;
        a.disp();

        Book b=new Book();
        b.name="Twisted Hate";
        b.author="Ana Huang";
        b.price=299;
        b.disp();
    }
}