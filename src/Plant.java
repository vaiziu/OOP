public class Plant {
    private String name;
    private boolean oneYear ;
    private String mainland ;
    private double height ;
    private boolean eatable;


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
    public String getMainLand(){
        return this.mainland;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setEatable(Boolean eatable) {
        this.eatable = eatable;
    }
    public boolean getEatable(){
        return this.eatable ;
    }

    @Override
    public String toString() {
        return this.name + " " + "yra" + " " +
                this.oneYear  + " " +
                this.mainland + " aukstis: " + " " +
                this.height +  "m., " + " " +
                this.eatable + "." ;
    }

    public Plant(String name, boolean oneYear, String mainland, double height, boolean eatable){
        this.name =name;
        this.oneYear = oneYear;
        this.mainland = mainland;
        this.height = height;
        this.eatable = eatable;
    }






}
