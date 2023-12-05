package classActivity;

public class Apartment {
    String city, address, driveway;
    int bedrooms, bathrooms, sqft;

    Apartment() {
        this.city = "Indy";
        this.driveway = "No";
        this.bedrooms = 2;
        this.bathrooms = 1;
        this.sqft = 1000;
        this.address = "123 W North St";

    }

    public void displayinfo() {
        System.out.printf("\nThis apartment is in %s. It has %d bedrooms with %d bathrooms. There is %d sqft of space.The address is %s.\nDriveway:%s", city, bedrooms, bathrooms, sqft, address, driveway);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDriveway(String driveway) {
        this.driveway = driveway;
    }

    public void setAddress(String address) {
        this.city = city;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getDriveway() {
        return driveway;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getSqft() {
        return sqft;
    }


    Apartment(String city, String address, String driveway, int bedrooms, int bathrooms, int sqft){
        this.city = city;
        this.driveway = driveway;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.sqft = sqft;
        this.address = address;
    }
}