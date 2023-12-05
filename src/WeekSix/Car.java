package WeekSix;

public class Car {



    //Member Variables/ Instant Variables / fields
    String Make, Model, VIN, Color;
    private int year;
    int miles;
    boolean iselectric;

    //default constructor
    //Constructors
    Car() {
        this.year = 2000;
        this.Make = "Empty";
        this.Model ="Empty";
        this.VIN = "1234abc567890";
        this.Color = "Grey";


    }
   Car(String make, int year, Boolean iselectric) {
        this.Make = make;
       this.iselectric = iselectric;
       this.year = year;


    }
   Car(String make, String model, int year, int miles) {
       this.Make = make;
       this.Model = model;
       this.year = year;
       this.miles = miles;

   }
   //Setters and Getters
    //Setters(Mutator Method
    public void setYears(int YEARS) {
        this.year = YEARS;
    }
    //Getters
    //(Accessor Method)
    public int getYear(){
        return year;




}

}
