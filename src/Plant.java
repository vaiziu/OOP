public class Plant {
    private String name;
    private Boolean oneYear ;
    private String mainland ;
    private Double height ;
    private Boolean x;




//    Pavadinimas
//lotyniskas pavadinimas
//boolean vienmetis
//kokiam zemyne auga
//suaugusio augalo aukstis metrais.
//ar valgomas?
    public Plant(){

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setOneYear(boolean oneYear) {
        this.oneYear = oneYear;
    }
    public boolean getOneYaear(){
        return this.oneYear;
    }
    public void setMainland(String mainland) {
        this.mainland = mainland;
    }
    public int getMainLand(){
        return this.mainland;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setX(Boolean x) {
        this.x = x;
    }
    public double getX(){
        return this.x;
    }
    @Override
    public String toString() {
        return this.name + " " +
                this.oneYear + " " +
                this.mainland + " " +
                this.height + " " +
                this.x ;
    }
//    public Book(String title, int pages, int releaseYear){
//        this.title = title;
//        this.pages = pages;
//        this.releaseYear = releaseYear;

    }







}
