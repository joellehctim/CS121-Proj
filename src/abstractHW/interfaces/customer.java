package abstractHW.interfaces;

import abstractHW.abstractClasses.user;

public class customer implements userID {
 private int loyaltyPoints;
 private String email, password;

    public customer(String email, String password, int loyaltyPoints) {
        this.email= email;
        this.password =password;
        this.loyaltyPoints = loyaltyPoints;}
    public int getLoyaltyPoints(){
        return loyaltyPoints;}

    public void setLoyaltyPoints(int loyaltyPoints){
        this.loyaltyPoints = loyaltyPoints;}

    @Override
    public String toString() {
        return String.format("Email: %s \nPassword %s\nLoyalty Points: %d",email, password, getLoyaltyPoints());
    }
    @Override
    public String createuserID(){
        return String.format("%s1234",email);
    }
    }

