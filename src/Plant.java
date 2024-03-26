import java.util.ArrayList;
import java.util.Arrays;

public class Plant {
    private String name;
    private boolean oneYear ; // geriau butu annual
    private String mainland ; // geriau butu plantContinent
    private double height ;
    private boolean eatable; // geriau butu isEatable


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
    public boolean getOneYear(){
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
        return this.name + " " + " " +
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
