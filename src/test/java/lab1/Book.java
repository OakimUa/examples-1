package lab1;

public class Book {
    String ISBN;
    String Author;
    String Title;
    String Excerpt;
    int index;

    public Book(String ISBN, String Author, String Title, String Excerpt)
    {
        this.ISBN = ISBN;
        this.Author = Author;
        this.Title = Title;
        this.Excerpt = Excerpt;
        index = 0;
    }

    public void getInfo()
    {
        System.out.println(ISBN);
        System.out.println(Author);
        System.out.println(Title);
        System.out.println(Excerpt);
    }
}
