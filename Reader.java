public class Reader{
    String name;
    int age;
    String favGenere;
    
    Reader(String n, int a,String fav ){
        this.name=n;
        this.age=a;
        this.favGenere=fav;
    }

    void disp(){
        System.out.println("Reader name: "+name);
        System.out.println("Reader age: "+age);
        System.out.println("Reader Favourite Genre "+favGenere);
    }

    public static void main(String[] args) {
        Reader a= new Reader("Dinesh",21,"Dark Romance");
        a.disp();
        PrimeReader b=new PrimeReader("Bla blaa",21,"Dark Romance",50);
        b.DispPrime();
    }
}

class PrimeReader extends Reader{

    int ShelfBooks;
    PrimeReader(String n,int a, String fav,int Sb){
        super(n,a,fav);
        this.ShelfBooks=Sb;
    }

    void DispPrime(){
        System.out.println("Reader name: "+name);
        System.out.println("Reader age: "+age);
        System.out.println("Reader Favourite Genre "+favGenere);
        System.out.println("Shelf Books : "+ShelfBooks);
    }

}