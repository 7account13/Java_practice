public class Movie{
    String movie_name;
    String genre;
    double rating;
    boolean romantic;

//Constructor//
    Movie(String m,String g,double r,boolean s){
        this.movie_name=m;
        this.genre=g;
        this.rating=r;
        this.romantic=s;
    }
    void disp(){
        System.out.println("Movie Name: "+movie_name);
        System.out.println("Genre: "+genre);
        System.out.println("Rating: "+rating+"/10");
        System.out.println("Romantic: "+romantic);
    }
    public static void main(String[] args) {
        Movie a =new Movie("twisted love","novel Romance", 7.5,true);
        Movie b =new Movie("365 Days","romance", 8,true);

        a.disp();
        b.disp();
    }
}
