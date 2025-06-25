
/* abstraction and encapsulation*/
abstract class Story{
    String genre;

    Story(String g){
        this.genre=g;
    }
abstract void narrate();
void intro(){
    System.out.println("This is intro of the Book for genre :"+genre);

}
public static void main(String[] args) {
    DarkRomanceStory r=new DarkRomanceStory("romance");
    r.intro();
    r.narrate();
    Story s= new DarkRomanceStory("Fiction");
    s.narrate();
    
}
}

class DarkRomanceStory extends Story{
    DarkRomanceStory(String g){
        super(g);
    }
    @Override
    void narrate(){
        System.out.println("This is intro of the Book for genre :"+genre);
        System.out.println("It looks like someone snatched the stars and threw that into your eyes");
        

    }

}