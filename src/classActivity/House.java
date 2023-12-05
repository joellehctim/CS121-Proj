package classActivity;

public class House {
    String city, address, driveway;

    int bedrooms, bathrooms, sqft;

    House(){
        this.city = "Cincy";
        this.driveway = "yes";
        this.bedrooms = 4;
        this.bathrooms = 6;
        this.sqft = 2200;
        this.address = "321 N West Dr.";
    }
    public void displayinfo(){
        System.out.printf("\nThis House is in %s. It has %d bedrooms with %d bathrooms. There is %d sqft of space.The address is %s.\nDriveway:%s",city,bedrooms,bathrooms,sqft,address,driveway);
    }
    public void setCity(String city){
        this.city= city;
    }
    public void setDriveway(String driveway){
        this.driveway= driveway;
    }
    public void setAddress(String address){
        this.city= city;
    }
    public void setBedrooms(int bedrooms){
        this.bedrooms= bedrooms;
    }
    public void setBathrooms(int bathrooms){
        this.bathrooms= bathrooms;
    }
    public void setSqft(int sqft){
        this.sqft= sqft;
    }
    public String getCity(){
        return city;
    }
    public String getAddress(){
        return address;
    }
    public String getDriveway(){
        return driveway;
    }
    public int getBedrooms(){
        return bedrooms;
    }
    public int getBathrooms(){
        return bathrooms;
    }
    public int getSqft(){
        return sqft;
    }
}


