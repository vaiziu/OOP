public class Book {
    private String title;
    private int pages;
    private int releaseYear;
    public void setTitle(String name) {
        this.title = name;
    }
    public String getTitle(){
        return this.title;
    }
    public Book(){

    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPages(){
        return this.pages;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }

}
