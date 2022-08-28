import Problem01.Book;

public class EBook extends Book {
    //attribute
    private String url;

    //Basic Constructor
    public EBook() {
    }

    //Parametric Constructor
    public EBook(String title, int year, String publish, int pages, String url) {
        super(title, year, publish, pages);
        this.url = url;
    }

    //Mutator
    public String getUrl() {
        return url;
    }

    //Accessor
    public void setUrl(String url) {
        this.url = url;
    }
}
