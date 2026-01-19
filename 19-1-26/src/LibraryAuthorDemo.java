class Book {
    String title;
    int year;
    Book(String t,int y){
        title=t; year=y;
    }
}

class Author extends Book {
    String name;
    String bio;
    Author(String t,int y,String n,String b){
        super(t,y); name=n; bio=b;
    }
    void displayInfo(){
        System.out.println(title+" "+year+" "+name);
    }
}

public class LibraryAuthorDemo {
    public static void main(String[] args){
        Author a=new Author("Java",2024,"James","Author");
        a.displayInfo();
    }
}
