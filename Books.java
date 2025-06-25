class Books{
    String about="a thousand charecters and a thousand different views";
    String name;

        Books(String n){
        
        this.name=n;
    }
    
    void describe(){
        System.out.println("Book Name: "+name);
        System.out.println("About:"+about);
    }

    public static void main(String[] args) {
        Books b=new Books("Twisted love");
        b.describe();
        Books c=new Romance("A book that traumatized generations","Haunting Adeline");
        c.describe();
    }

}
class Romance extends Books{
    

    Romance(String a,String n){
        super(n);


    }
    

    @Override 
    void describe(){
        this.about="For all the grils who think they lost their holiness by reading dark romance. You still haven't yet actually you've just entered to the hell of it now turn the page ........... Yes Good Girl";
        System.out.println("Book Name: "+name);
        System.out.println("About:"+about);

    }

    

}