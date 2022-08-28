public class Book {
    //attributes
    private String title;
    private int year;
    private String publish;
    private int pages;

    //Basic Constructor
    public Book() {
    }

    //Parametric Constructor
    public Book(String title, int year, String publish, int pages) {
        this.title = title;
        this.year = year;
        this.publish = publish;
        this.pages = pages;
    }

    //Accessor
    public String getTitle() {
        return title;
    }

    //Mutator
    public void setTitle(String title) {
        this.title = title;
    }

    //Accessor
    public int getYear() {
        return year;
    }

    //Mutator
    public void setYear(int year) {
        this.year = year;
    }

    //Accessor
    public String getPublish() {
        return publish;
    }

    //Mutator
    public void setPublish(String publish) {
        this.publish = publish;
    }

    //Accessor
    public int getPages() {
        return pages;
    }

    //Mutator
    public void setPages(int pages) {
    Scanner sc = new Scanner(System.in);
        while (true) {
            if (page >= 1) {
                this.page = page;
                break;
            }else {
                System.out.println("Page should be greater than or equal to one! Please input page again!");
                page = sc.nextInt();
            }
        }
    }
}
