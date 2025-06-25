import java.util.ArrayList;
import java.util.List;

public class Lists{
    public static void main(String[] args) {

    List<String> Books = new ArrayList<>();
    Books.add("BOB");
    Books.add("Marley");
    Books.add("Hitler");
    Books.add("BOB");

    System.out.println("List of Books : "+Books);

    System.out.println("Size of List : "+Books.size());

    /*Books.remove(0);
    System.out.println("List of Books after removing : "+Books);

    System.out.println("Size of List after removing : "+Books.size());
*/
    for(String book:Books){
        System.out.println(book);
    }
    boolean contains=Books.contains("BOB");
    if (contains){
        System.out.println("Ohh Bob is still here");

    }
    else{
        System.out.println("Bob's Gone");
    }


    }




    

}